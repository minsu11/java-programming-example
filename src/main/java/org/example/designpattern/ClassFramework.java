package org.example.designpattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class ClassFramework {
    private static final int CAPACITY_INIT = 10;
    private Class<?>[] clazz;
    private static HashMap<String,Object> instanceMap = new HashMap<>();



    public static<T> T createInstance(String className) throws ClassNotFoundException {
        return checkInstance(className);
    }

    private static<T> T checkInstance(String className) throws ClassNotFoundException {
        if(instanceMap.containsKey(className)){
            return (T) instanceMap.get(className);
        }
        Class<?> instance = Class.forName(className);

        instanceMap.put(className,instance);
        return (T) instance;
    }










}
