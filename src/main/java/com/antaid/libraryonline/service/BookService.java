package com.antaid.libraryonline.service;

import com.antaid.libraryonline.model.Book;


public class BookService {
    public void displayBookDetails(Book book) {

        System.out.println("Judul Buku: " + book.getJudul());
        System.out.println("Pengarang: " + book.getPengarang());
        System.out.println("Tahun Terbit: " + book.getTahunTerbit());
    }
}
