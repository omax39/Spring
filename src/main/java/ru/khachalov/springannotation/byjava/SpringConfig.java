package ru.khachalov.springannotation.byjava;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.khachalov.springannotation.byjava")
@PropertySource("classpath:bookReader.properties")
public class SpringConfig {
}
