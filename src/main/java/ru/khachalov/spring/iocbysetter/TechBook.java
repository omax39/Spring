package ru.khachalov.spring.iocbysetter;

public class TechBook implements Books {

    @Override
    public String getBook() {
        return "Information";
    }
}
