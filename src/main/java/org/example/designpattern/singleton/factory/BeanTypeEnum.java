package org.example.designpattern.singleton.factory;

public enum BeanTypeEnum {
    SINGLETON("singleton"),
    PROTOTYPE("prototype");

    String type;
    private BeanTypeEnum(String type) {
        this.type = type;
    }

    public String getType(){
        return this.type;
    }

    public static String checkType(String type)  {
        for (BeanTypeEnum beanTypeEnum : BeanTypeEnum.values()) {
            if (beanTypeEnum.getType().equals(type)) {
                return beanTypeEnum.getType();
            }
        }
        throw new ClassBeanCreateTypeNotMatchException();
    }
}
