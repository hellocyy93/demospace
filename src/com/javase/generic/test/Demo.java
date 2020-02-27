package com.javase.generic.test;

import java.util.ArrayList;
import java.util.List;

public class Demo {
   /* private T filed;

    public T getFiled() {
        return filed;
    }

    public void setFiled(T filed) {
        this.filed = filed;
    }*/
   public <T> List<T> newArrayList() {
       return new ArrayList<T>();
   }
   public <T> void showClass(T t) {
       System.out.println(t.getClass());
    }
    /**
     * 方法定义时，使用通配符 ？
     */
    public void show(List<?> list) {
        list.add(null);
        for (Object object:list) {
            System.out.println(object);
        }
    }
    /**
     * 类或者方法定义时，使用通配符 <T extends Number>
     */
    public <T extends Number> void actionClass(T t) {
        System.out.println(t.getClass());
    }
}
