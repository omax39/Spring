package ru.khachalov.springannotation.annotHW;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "appContextAnnotHW.xml"
        );
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
        BookReader br = context.getBean("bookReader", BookReader.class);

        System.out.println(br.getName());
        System.out.println(br.getVolume());

        TechBook tb1 = context.getBean("techBook", TechBook.class);
        TechBook tb2 = context.getBean("techBook", TechBook.class);

        System.out.println(tb1==tb2);

        context.close();
    }
}
