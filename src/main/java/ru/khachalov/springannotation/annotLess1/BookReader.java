package ru.khachalov.springannotation.annotLess1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BookReader {
    private Books books1;
    private Books books2;

    @Autowired
    public BookReader(@Qualifier("techBook") Books books1,
                      @Qualifier("geographyBook") Books books2) {
        this.books1 = books1;
        this.books2 = books2;
    }

    //    public BookReader(Books books) {
//        this.books = books;
//    }
//
//    @Autowired
//    public void setBooks(Books books) {
//        this.books = books;
//    }

    public String readBook(){
//        System.out.println("Reading: " + books.getBook());
//        System.out.println("Reading: " + techBook.getBook());
//        System.out.println("Reading: " + geographyBook.getBook());
        return "Reading: " +  books1.getBook() + ", " + books2.getBook();

    }


}
