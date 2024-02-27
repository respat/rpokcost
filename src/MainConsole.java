/*
 * Resperger Patrik, 2024-02-26
 * Copyright (c) 2024, Resperger Patrik
 * Licenc: MIT
 * Refakotárlás esetén jelölje meg, ki, mikor.
 */

 import java.util.Scanner;


 public class MainConsole {
     /**
      * Konstruktor, ami a költségek megadását teszi lehetővé.
      * A felhasználótól bekéri a szállítási, üzleti és javítási költségeket, majd kiírja azokat egy fájlba.
      */
     public MainConsole() {
         System.out.println("╔═════════════════════════════════════════╗");
         System.out.printf("║%17s%25s\n", "Projekt költsége", "║");
         System.out.println("╚═════════════════════════════════════════╝");
 
         // Felhasználói adatbekérés 
         try (Scanner scanner = new Scanner(System.in)) {
             System.out.println("──────────────────────────────────────────");
             System.out.print("Szállítási költség: ");
             String szallitasKoltseg = scanner.nextLine();
 
             System.out.println("──────────────────────────────────────────");
             System.out.print("Üzleti költség: ");
             String uzletiKoltseg = scanner.nextLine();
 
             System.out.println("──────────────────────────────────────────");
             System.out.print("Javítási költség: ");
             String javitasiKoltseg = scanner.nextLine();
 
             // Költség objektum létrehozása és a fájlba írás
             Koltseg koltseg = new Koltseg(szallitasKoltseg, uzletiKoltseg, javitasiKoltseg);
             FileHandler fileHandler = new FileHandler();
             fileHandler.costsToFile(koltseg);
         }
     }
 }
 
