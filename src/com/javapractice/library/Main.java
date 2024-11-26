package com.javapractice.library;

public class Main {
    Book[] books;
    public static void main(String[] args) {
        Book[] books = new Book[3];

        Book myBook1 = new Book("Палата номер 6", "Антон Чехов", 1892);
        Book myBook2 = new Book("Капитанская дочка", "Александр Пушкин", 1836);
        Book myBook3 = new Book("Повелитель Мух", "Уильям Голдинг", 1954);

        addBook(books, myBook1, 0);
        addBook(books, myBook2, 1);
        addBook(books, myBook3, 2);

        printAllBooks(books);

    }

        //Добавление книги
    public static void addBook(Book[] books, Book newBook, int index) {
        books[index] = newBook;
    }
        //Вывод всех книг
    public static void printAllBooks(Book[] books) {
        for (Book book : books) {
            book.printBookInfo();
        }
    }
}
