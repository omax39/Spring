package ru.khachalov.spring.ioctest;

public class GeographyBook implements Books{
    @Override
    public String getBook() {
        return "Africa";
    }
}
