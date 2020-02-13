package ru.khachalov.spring.iocHW;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
//        Books books = context.getBean("bookBean", Books.class);
//        BookReader br = new BookReader(books);

        BookReader bookReader = context.getBean("bookReaderByHW", BookReader.class);
        bookReader.readBook();
        System.out.println(bookReader.getName());
        System.out.println(bookReader.getVolume());
        context.close();
    }
}
