package ru.khachalov.springannotation.annotLess1;

import org.springframework.stereotype.Component;

@Component
public class TechBook implements Books {

    @Override
    public String getBook() {
        return "Information";
    }
}
