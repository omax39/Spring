package ru.khachalov.spring.iocHW;

public class TechBook implements Books {

    @Override
    public String getBook() {
        return "Information";
    }
}
