package test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samundra
 */
public class Singleton {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private Singleton() {
    }
    
    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
    
    private static class SingletonHolder {

        private static final Singleton INSTANCE = new Singleton();
    }
}
