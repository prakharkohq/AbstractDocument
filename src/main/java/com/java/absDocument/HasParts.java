package com.java.absDocument;

import java.util.stream.Stream;

public interface HasParts extends Document {
    String property="parts";
    default Stream<Part> getParts()
    {
        return childrens(property,Part::new);
    }
}
