package com.java.absDocument;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Stream;

public abstract class AbstractDocument implements Document {
    private Map<String, Object> properties = new HashMap<>();

    //protected constructor can be accessed from its own class, its subclasses so it would be usefu
    protected AbstractDocument(Map<String, Object> map) {
        //Objects.requireNonNull(map, "Please Do not initialize Abstract Document with Null Value  ");
        this.properties = map;
    }

    @Override
    public Void put(String key, Object value) {
        properties.put(key, value);
        //For void it is better Use return null. Void can't be instantiated and is merely a placeholder for the Class<T> type of void.
        return null;
    }

    @Override
    public Object get(String key) {
        return properties.get(key);
    }

    @Override
    public <T> Stream<T> childrens(String key, Function<Map<String, Object>, T> constructor) {
        /* From Constructors in the function we are identifying overriding method of the class
         the moment you will write Stream of it will prompt you with the constructor method for the class*/
        Optional<List<Map<String, Object>>> childrens = Stream.of(get(key)).filter(el -> el != null).
                map(el -> (List<Map<String, Object>>) el).findAny();
        return childrens.isPresent() ? childrens.get().stream().map(constructor) : Stream.empty();
    }

    @Override
    public String toString() {
        //Print the whole map with each value of there elements
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName()).append("[");
        properties.entrySet().
                forEach(e -> sb.append("[").append(e.getKey()).append("  : ").append(e.getValue()).append("]"));
        String length = String.valueOf(properties.size());
        sb.append("\n Length of the String is ").append(length);
        return sb.toString();
    }
}
