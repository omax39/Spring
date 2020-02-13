package ru.khachalov.spring.iocbysetter;

public class GeographyBook implements Books {
    @Override
    public String getBook() {
        return "Africa";
    }
}
