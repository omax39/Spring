package ru.khachalov.springannotation.annotHW;

import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import java.util.ArrayList;
import java.util.List;

@Component
public class GeographyBook implements Books {
    private List<String> gBooks = new ArrayList<>();

    public GeographyBook(){
        gBooks.add("Africa");
        gBooks.add("Europe");
        gBooks.add("Asia");
    }


    @Override
    public List<String> getBook() {
        return gBooks;
    }

    @PostConstruct
    public void myInit(){
        System.out.println("Initialisation");
    }

    @PreDestroy
    public void myDestroy(){
        System.out.println("Destroy");
    }

}
