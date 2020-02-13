package ru.khachalov.spring.iocHW;

public class GeographyBook implements Books {
    @Override
    public String getBook() {
        return "Africa";
    }
}
