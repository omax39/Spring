package ru.khachalov.springannotation.annotHW;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private int id;
    private BookReader bookReader;
    private Genre genre = Genre.GEO;
    @Autowired
    public Computer(BookReader bookReader) {
        this.id = 1;
        this.bookReader = bookReader;
    }

    @Override
    public String toString() {
        return "Computer " + id + " " + bookReader.readBook(genre);
    }
}
