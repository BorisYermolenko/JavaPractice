package com.javapractice.library;

public class Book {
    String book;
    String author;
    int year;

        //Конструктор объекта
    public Book (String book, String author, int year) {
        this.book = book;
        this.author = author;
        this.year = year;
    }

        //Вывод информации о книге
    public void printBookInfo(){
        System.out.println("Книга: " + book + ", Автор: " + author + ", Год публикации: " + year);
    }
}

