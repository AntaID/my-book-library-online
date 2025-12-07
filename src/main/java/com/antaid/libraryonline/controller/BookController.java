package com.antaid.libraryonline.controller;

import com.antaid.libraryonline.model.Book;
import java.util.Scanner;

public class BookController {
    public Book createBook() {
        Scanner input = new Scanner(System.in);
        Book book = new Book();

        System.out.print("Masukan Judul Buku: ");
        String judulInput = input.nextLine();
        book.setJudul(judulInput);

        System.out.print("Masukan Pengarang: ");
        String pengarangInput = input.nextLine();
        book.setPengarang(pengarangInput);

        try {
            System.out.print("Masukan Tahun Terbit: ");
            int tahunTerbitInput = Integer.parseInt(input.nextLine());
            book.setTahunTerbit(tahunTerbitInput);
        } catch (NumberFormatException e) {
            System.out.println("Input salah! Harus berupa angka.");
        }
        return book;
    }
}