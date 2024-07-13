package org.example.designpattern.singleton.factory;

import java.util.HashMap;

import static java.lang.Class.*;

public class ClassFramework {
    private static final int CAPACITY_INIT = 10;
    private static final HashMap<String,Object> instanceMap = new HashMap<>();


    public static Object createInstance(Class<?> className) throws Exception {
        return checkInstance(className.getName());
    }
    private static Object checkInstance(String className) throws Exception {
        String annotation = BeanTypeEnum.checkType(forName(className).getAnnotation(CreationBean.class).value().toLowerCase());
        if(BeanTypeEnum.PROTOTYPE.getType().equals(annotation)){
            return createProtoType(className);
        }
        return createSingleton(className);
    }

    private static Object createSingleton(String className) throws Exception {
        if(instanceMap.containsKey(className)){
            return instanceMap.get(className);
        }
        Object o = forName(className).getDeclaredConstructor().newInstance();
        instanceMap.put(className, o);
        return o;
    }

    private static Object createProtoType(String className) throws Exception {
        return forName(className).getDeclaredConstructor().newInstance();
    }

}
