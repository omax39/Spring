package ru.khachalov.spring.beans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeans {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        BeansLess bl = context.getBean("beansLess", BeansLess.class);
        BeansLess bl1 = context.getBean("beansLess", BeansLess.class);
        BeansLess bl2 = context.getBean("beansLess", BeansLess.class);
        BeansLess bl3 = context.getBean("beansLess", BeansLess.class);
        System.out.println(bl.getName());
        System.out.println(bl1.getName());
        System.out.println(bl2.getName());
        System.out.println(bl3.getName());
        context.close();
    }

}
