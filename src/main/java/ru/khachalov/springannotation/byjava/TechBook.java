package ru.khachalov.springannotation.byjava;

import org.springframework.stereotype.Component;

@Component
public class TechBook implements Books {

    @Override
    public String getBook() {
        return "Information";
    }
}
