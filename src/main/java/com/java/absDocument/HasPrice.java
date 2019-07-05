package com.java.absDocument;


import java.util.Optional;

public interface HasPrice extends Document {
    String property="price";
    default Optional<String> getPrice(){
        return Optional.ofNullable((String)get(property));
    }
}
