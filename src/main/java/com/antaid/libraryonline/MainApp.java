package com.antaid.libraryonline;

import com.antaid.libraryonline.model.Book;
import com.antaid.libraryonline.service.BookService;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {

        List<Book> rakBuku = new ArrayList<>();

        Book b1 = new Book();
        b1.setJudul("Pemrograman Java");
        b1.setPengarang("Andi Susanto");

        Book b2 = new Book();
        b2.setJudul("Belajar Struktur Data");
        b2.setPengarang("Rangga Wirangga");

        rakBuku.add(b1);
        rakBuku.add(b2);

        BookService service = new BookService();

        System.out.println("=== DAFTAR BUKU DI PERPUSTAKAAN ===");
        for (Book bukuSaatIni : rakBuku) {
            service.displayBookDetails(bukuSaatIni);
            System.out.println("-------------------------");
        }
    }
}
