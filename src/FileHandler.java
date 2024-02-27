/*
 * Resperger Patrik, 2024-02-26
 * Copyright (c) 2024, Resperger Patrik
 * Licenc: MIT
 * Refakotárlás esetén jelölje meg, ki, mikor.
 */

import java.io.FileWriter;
import java.io.IOException;


public class FileHandler {
    /* A költségeket egy szövegfájlba írja
     * 
     * @param koltseg Egy objektum, ami a szállítási, üzleti és javítási költségeket tartalmazza
     */
    public void costsToFile(Koltseg koltseg) {
        try (FileWriter fw = new FileWriter("adat.txt", true)) {
            fw.write(koltseg.getSzallitas() + ":" + koltseg.getUzlet() + ":" + koltseg.getJavitas() + "\n");
        } catch (IOException e) {
            e.printStackTrace(); // Log írása, ha hiba történik a fájl írásakor.
        }
    }
}
