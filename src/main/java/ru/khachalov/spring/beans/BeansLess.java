package ru.khachalov.spring.beans;

public class BeansLess {
    private String name;
    private int a = (int)(Math.random()*100);
    public void initMethod(){
        System.out.println(a);
    }

    public void destroyMethod(){
        System.out.println("Конец");
    }

    public BeansLess(String name) {
        this.name = name;
    }

    public String getName() {
        return name + a;
    }

    public void setName(String name) {
        this.name = name;
    }



}
