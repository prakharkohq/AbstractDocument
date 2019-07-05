package com.java.absDocument;

import java.util.Optional;

public interface HasModel extends Document {
    String property="model";
     // Any one calling gettype must need to implement  get method
     default Optional<String> getModel()
     {
         //    Object obj=get(property);
         //    Get method is available everywhere inside the scope of the interface
         return Optional.ofNullable((String)get(property));
     }
}
