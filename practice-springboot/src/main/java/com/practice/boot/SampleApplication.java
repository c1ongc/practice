package com.practice.boot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author cui.longcan 2021/6/30
 */

@SpringBootApplication
public class SampleApplication implements CommandLineRunner {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        Thread.currentThread().join();
    }
}
