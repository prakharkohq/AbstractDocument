package com.java.absDocument;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class App {
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
    public App()
    {
        Map<String,Object> laptopProperties= new HashMap<>();
        laptopProperties.put(HasModel.property," Dell AlienWare  ");
        laptopProperties.put(HasPrice.property,"250000");

        Map<String,Object> processorProperties=new HashMap<>();
        processorProperties.put(HasType.property,"Processor");
        processorProperties.put(HasModel.property,"Core I7");
        processorProperties.put(HasPrice.property,"13000");

        Map<String,Object> RamProperties=new HashMap<>();
        RamProperties.put(HasType.property,"RAM");
        RamProperties.put(HasModel.property,"DDR3 Dynet");
        RamProperties.put(HasPrice.property,"1200");
        laptopProperties.put(HasParts.property, Arrays.asList(processorProperties,RamProperties));
        Laptop laptop=new Laptop(laptopProperties);
        LOGGER.info(" Here is My Laptop ");
        System.out.println(laptop.toString());
    }

    public static void main(String[] args) {
        LOGGER.info("  Inside Laptop Assembly Method   ");
        new App();
    }
}
