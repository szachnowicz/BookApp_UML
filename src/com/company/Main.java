package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Facade facade = new Facade();
        String t1[] = {"1", "Author1", "Title1", "ISBN1", "Publisher1"};  
        String t2[] = {"1", "Author2", "Title2", "ISBN2", "Publisher2"};  
        String t3[] = {"1", "Author3", "Title3", "ISBN3", "Publisher3"};  

        facade.addTitleBook(t1);
        facade.addTitleBook(t2);
        facade.addTitleBook(t2);
        facade.addTitleBook(t3);

        String lan = facade.getTitleBooksList().toString();
        System.out.println(lan);  

        String d1[] = {"0", "ISBN1"};  
        String d2[] = {"0", "ISBN2"};  
        String d3[] = {"0", "ISBN5"};  
        String tr1[] = {"0", "1"};  
        String tr2[] = {"0", "2"};  

        ArrayList<String> pom = facade.addBook(d1, tr1);

        if (pom != null) {  
            System.out.print(pom);
        }  
        pom = facade.addBook(d2, tr1);
        if (pom != null) {  
            System.out.print(pom);
        }  
        pom = facade.addBook(d2, tr1);
        if (pom != null) {  
            System.out.print(pom);
        }  
        pom = facade.addBook(d2, tr2);
        if (pom != null) {  
            System.out.print(pom);
        }  
        pom = facade.addBook(d3, tr2);
        if (pom != null) {  
            System.out.print(pom);
        }  
        System.out.println();  
    }

}
