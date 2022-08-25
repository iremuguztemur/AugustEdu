package tr.com.testinium.firstday;

public class Methods {

    public static void main(String[] args) {
        Methods methods = new Methods();
        System.out.println(methods.topla(3, 5));
        methods.carpma(1,2);
        methods.carpma(1,6,12,12,1,3,5,6,3,2,1,3);
        System.out.println(args[0]);
    }



     int topla(int a, int b) {
        return a + b;
    }
    int topla(int a, int b,int c) {
        return a + b + c;
    }

    int carpma(int... deger){
        int result = 1;
        for(int i: deger){
            result *= i;
        }
        return result;
    }





}
