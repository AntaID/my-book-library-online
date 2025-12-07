package com.antaid.libraryonline.controller;

import com.antaid.libraryonline.model.Book;
import java.util.Scanner;

public class BookController {
    public Book createBook() {
        Scanner input = new Scanner(System.in);
        Book book = new Book();

        System.out.println("Masukan Judul Buku: ");
        String judulInput = input.nextLine();
        book.setJudul(judulInput);

        System.out.println("Masukan Pengarang: ");

        return book;
    }
}
