package ru.khachalov.springannotation.annotLess1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private int id;
    private BookReader bookReader;

    @Autowired
    public Computer(BookReader bookReader) {
        this.id = 1;
        this.bookReader = bookReader;
    }

    @Override
    public String toString() {
        return "Computer " + id + " " + bookReader.readBook();
    }
}
