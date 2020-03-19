package ru.khachalov.springannotation.annotHW;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("prototype")
public class TechBook implements Books {
    private List<String> tBooks = new ArrayList<>();

    public TechBook(){
        tBooks.add("Phisics");
        tBooks.add("Informatic");
        tBooks.add("Maths");
    }


    @Override
    public List<String> getBook() {
        return tBooks;
    }
}
