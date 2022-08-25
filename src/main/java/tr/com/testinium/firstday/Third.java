package tr.com.testinium.firstday;

public class Third {
    public static void main(String[] args) {
        Uye u1 = new Uye();
        u1.ad = "Ebubekir";
        u1.soyad = "Durukal";

        Adres adres = new Adres();
        adres.mahalle = "Petolis Mah.";
        adres.sokak = "Kizilay Sok.";
        adres.numara = 8;

        u1.adres = adres;
        Sehir istanbul = new Sehir();
        istanbul.ad = "İstanbul";
        istanbul.plakaNo = 34;
        u1.sehir = istanbul;


        System.out.println(u1.adres.mahalle);

        int x = 5;
        int y = x;

        Uye u2 = u1;

    }

}
