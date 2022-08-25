package tr.com.testinium.secondday;

import tr.com.testinium.firstday.Ornek;

public class Ogrenci implements Coder, Sporcu{

    String ad;
    String soyad;

    public Ogrenci() {
    }

    public Ogrenci(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
    }

    public static void main(String[] args) {
        Ogrenci ogrenci = new Ogrenci();
        ogrenci.ad = "Mehmet";
        ogrenci.soyad = "Aksahin";
        Ogrenci ogrenci2 = new Ogrenci("Mehmet", "Aksahin");
        ogrenci.kodla();

        tr.com.testinium.secondday.Ornek ornek  = new tr.com.testinium.secondday.Ornek();


    }

    @Override
    public void kodla() {
        System.out.println("öğrenci kodlar");
    }

    @Override
    public void kos() {
        System.out.println("öğrenci koşar");
    }
}
