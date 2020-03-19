package ru.khachalov.springannotation.byjava;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.annotation.Annotation;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
//        Books book1 = context.getBean("someTechBook", Books.class);
//        Books book2 = context.getBean("someGeoBook", Books.class);
//        BookReader br = new BookReader(book1);
//        BookReader br1 = new BookReader(book2);
//
//        br.readBook();
//        br1.readBook();

//        BookReader bookReader = context.getBean("bookReader", BookReader.class);
//        bookReader.readBook();

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);

        context.close();
    }
}
