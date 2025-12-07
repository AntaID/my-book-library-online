package com.antaid.libraryonline;

import com.antaid.libraryonline.model.Book;
import com.antaid.libraryonline.service.BookService;
import com.antaid.libraryonline.controller.BookController;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        List<Book> rakBuku = new ArrayList<>();
        BookController controller = new BookController();
        BookService service = new BookService();
        Scanner inputMenu = new Scanner(System.in);

        boolean isRunning = true;

        while (isRunning) {
            System.out.println("\n=== MENU PERPUSTAKAAN ===");
            System.out.println("1. Tambah Buku Baru");
            System.out.println("2. Lihat Daftar Buku");
            System.out.println("0. Keluar");

            System.out.print("Pilih menu: ");
            String pilihan = inputMenu.nextLine();
            switch (pilihan) {
                case "1":
                    Book bukuBaru = controller.createBook();
                    rakBuku.add(bukuBaru);
                    break;
                case "2":
                    System.out.println("=== DAFTAR BUKU DI PERPUSTAKAAN ===");
                    for (Book bukuSaatIni : rakBuku) {
                        service.displayBookDetails(bukuSaatIni);
                        System.out.println("-------------------------");
                    }
                    break;
                case "0":
                    isRunning = false;
                    System.out.println("Terima kasih telah menggunakan aplikasi perpustakaan.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        }

//        System.out.println("=== PENDAFTARAN BUKU BARU ===");
//
//        Book bukuBaru = controller.createBook();
//        rakBuku.add(bukuBaru);


//        System.out.println("=== DAFTAR BUKU DI PERPUSTAKAAN ===");
//        for (Book bukuSaatIni : rakBuku) {
//            service.displayBookDetails(bukuSaatIni);
//            System.out.println("-------------------------");
//        }
    }
}
