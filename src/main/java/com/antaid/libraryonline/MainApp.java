package com.antaid.libraryonline;

import com.antaid.libraryonline.model.Book;
import com.antaid.libraryonline.service.BookService;
import com.antaid.libraryonline.controller.BookController;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {

        List<Book> rakBuku = new ArrayList<>();

        BookController controller = new BookController();

        System.out.println("=== PENDAFTARAN BUKU BARU ===");

        Book bukuBaru = controller.createBook();
        rakBuku.add(bukuBaru);

        BookService service = new BookService();

        System.out.println("=== DAFTAR BUKU DI PERPUSTAKAAN ===");
        for (Book bukuSaatIni : rakBuku) {
            service.displayBookDetails(bukuSaatIni);
            System.out.println("-------------------------");
        }
    }
}
