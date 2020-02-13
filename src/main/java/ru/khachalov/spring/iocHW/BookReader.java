package ru.khachalov.spring.iocHW;

import java.util.List;

public class BookReader {
    private List<Books> books;
    private String name;
    private int volume;

    public void setBooks(List<Books> books) {
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void readBook(){
        for (int i = 0; i < books.size(); i++) {
            System.out.println("Reading: " + books.get(i).getBook());
        }
    }
}
