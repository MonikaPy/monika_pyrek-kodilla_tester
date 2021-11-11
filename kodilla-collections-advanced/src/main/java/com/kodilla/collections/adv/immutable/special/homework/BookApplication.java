package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        Book book =  BookManager.createBook("Pan Tadeusz", "Adam Mickiewicz");
        Book book1 = BookManager.createBook("Bardzo zimna wiosna", "Katarzyna Tubylewicz");
        Book book2 =  BookManager.createBook("Lalka", "Bolesław Prus");
        Book book3 =  BookManager.createBook("Pan Tadeusz", "Adam Mickiewicz");
        System.out.println(book == book1);
        System.out.println(book.equals(book1));
        System.out.println(book == book3);
        System.out.println(book.equals(book3));
    }
}