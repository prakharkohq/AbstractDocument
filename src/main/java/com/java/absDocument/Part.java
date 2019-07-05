package com.java.absDocument;

import java.util.Map;

public class Part extends AbstractDocument implements HasPrice, HasModel {

    public Part(Map<String,Object> properties)
    {
        super(properties);
    }
}
