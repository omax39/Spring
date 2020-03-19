package ru.khachalov.springannotation.byjava;

import org.springframework.stereotype.Component;

@Component
public class GeographyBook implements Books {
    @Override
    public String getBook() {
        return "Africa";
    }
}
