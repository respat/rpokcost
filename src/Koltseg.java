/*
 * Resperger Patrik, 2024-02-26
 * Copyright (c) 2024, Resperger Patrik
 * Licenc: MIT
 * Refakotárlás esetén jelölje meg, ki, mikor.
 */

 public class Koltseg {
    private Double szallitas;
    private Double uzlet;
    private Double javitas;

    /**
     * Konstruktor a költségek létrehozásához.
     * 
     * @param szallitas A szállítási költség szöveges formátumban.
     * @param uzlet Az üzleti költség szöveges formátumban.
     * @param javitas A javítási költség szöveges formátumban.
     */
    public Koltseg(String szallitas, String uzlet, String javitas) {
        this.szallitas = Double.parseDouble(szallitas);
        this.uzlet = Double.parseDouble(uzlet);
        this.javitas = Double.parseDouble(javitas);
    }

    // Getter metódusok a költségek lekérdezéséhez.
    public Double getSzallitas() { return szallitas; }
    public Double getUzlet() { return uzlet; }
    public Double getJavitas() { return javitas; }
}
