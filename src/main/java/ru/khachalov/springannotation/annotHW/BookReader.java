package ru.khachalov.springannotation.annotHW;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BookReader {
    private Books books1;
    private Books books2;

    @Value("${bookReader.name}")
    private String name;
    @Value("${bookReader.volume}")
    private int volume;

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

    public String readBook(Genre genre){
//        System.out.println("Reading: " + books.getBook());
//        System.out.println("Reading: " + techBook.getBook());
//        System.out.println("Reading: " + geographyBook.getBook());
        int i = (int)(Math.random()*3);
        switch (genre){
            case GEO:
                return "Reading: " +  books2.getBook().get(i);
            case TECH:
                return "Reading: " +  books1.getBook().get(i);
            default:
                return "Not reading";
        }
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }
}
