/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 *
 * @author Hp
 */
        


 @SpringBootApplication
public class Demo2 {

    public static void main(String args[]) throws Exception{
        SpringApplication.run(Demo2.class, args);
        System.out.println("loaded");
        
    }
}
