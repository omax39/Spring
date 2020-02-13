package ru.khachalov.spring.ioctest;

public class BookReader {
    private Books books;

    public BookReader(Books books) {
        this.books = books;
    }

    public void readBook(){
        System.out.println("Reading: " + books.getBook());
    }
}
