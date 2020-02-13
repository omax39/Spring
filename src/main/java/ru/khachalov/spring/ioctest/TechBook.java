package ru.khachalov.spring.ioctest;

public class TechBook implements Books {

    @Override
    public String getBook() {
        return "Information";
    }
}
