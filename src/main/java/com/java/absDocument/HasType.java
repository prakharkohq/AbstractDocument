package com.java.absDocument;

import java.util.Optional;

public interface HasType extends Document {
    public String property = "type";

    public default Optional<String> getType() {
        return Optional.ofNullable((String) get(property));
    }
}
