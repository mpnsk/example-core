package com.github.mpnsk.core;

import com.github.mpnsk.Entity;

import java.util.ArrayList;
import java.util.List;

public class Life {
    private List<Entity> entityList = new ArrayList<>();

    public void add(Entity entity) {
        entityList.add(entity);
    }

    public void start() {
        entityList.forEach(entity -> entity.setAge(entity.getAge() + 1));
    }

    public void print(){
        entityList.forEach(System.out::println);
    }

}
