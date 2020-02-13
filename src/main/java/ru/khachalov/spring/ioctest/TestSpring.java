package ru.khachalov.spring.ioctest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
//        Books books = context.getBean("bookBean", Books.class);
//        BookReader br = new BookReader(books);

        BookReader bookReader = context.getBean("bookReader", BookReader.class);
        bookReader.readBook();
        context.close();
    }
}
