package ru.khachalov.spring.iocbysetter;

public class BookReader {
    private Books books;
    private String name;
    private int volume;

    public void setBooks(Books books) {
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
        System.out.println("Reading: " + books.getBook());
    }
}
