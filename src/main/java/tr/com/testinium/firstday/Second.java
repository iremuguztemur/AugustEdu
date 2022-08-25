package tr.com.testinium.firstday;

public class Second {


    public static void main(String[] args) {
        boolean a = false;
        boolean b = true;

        boolean c = a | b; // true
        boolean d = a || b; // true;

        String s1 = "abc";
        String s2 = "def";
        int i1 = 5;
        int i2 = 3;
        String s3 = s1 + s2 + i1 + i2;
        String s4 = i1 + i2 + s1 + s2;
        System.out.println(s3);
        System.out.println(s4);


//        int dersNotu = 55;
//
//        if (dersNotu >= 0 && dersNotu < 59) {
//            System.out.println("F aldınız :/");
//        } else if (dersNotu >= 60 && dersNotu < 69) {
//            System.out.println("D aldınız");
//        } else if (dersNotu >= 70 && dersNotu < 79) {
//            System.out.println("C aldınız");
//        }


//        int deger = 3;
//        switch (deger){
//            case 1:
//                System.out.println(1);
//                break;
//            case 2:
//                System.out.println(2);
//                break;
//            case 3:
//                System.out.println(3);
//                break;
//            default:
//                System.out.println("başka bir deger");
//                break;
//        }


        for (int i = 0; i < 10; i++) {
            System.out.println("Ebubekir Durukal");
        }

//        for(;;){
//            System.out.println("Ebubekir Durukal");
//        }
//
//        for(int i = 0;i < 100; i = i + 2){
//            System.out.println("i = " + i);  // for
//        }
//
//        int[] list = {1,2,3};
//
//        for(int t : list){
//            System.out.println(t);  // for each
//        }


        test: for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.print(i * j + " - ");
                if(j == 3){
                    break test;
                }
            }
            System.out.println();
        }


        int i = 5;
        while (i < 10) {
            System.out.println(i);
            i++;
        }

        do {
            System.out.println("Merhaba Testinium");
        } while (false);


    }
}
