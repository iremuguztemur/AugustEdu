package tr.com.testinium.secondday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collections {

    public static void main(String[] args) {

        // ARRAYS

        int[] list = new int[5]; // definition 1
        list[0] = 3;
        list[1] = 2;
        list[3] = 3;

        int[][] list3 = new int[3][3];
        int[][][][] list4 = new int[3][3][4][5];
        list3[0][0] = 3;

        for (int i : list) {
            // System.out.println(list[i]);
        }

        int[] list2 = {12, 2, 34, 4, 0}; // definition 2
        for (int i : list2) {
            //System.out.print(i + " ");
        }
        //System.out.println();
        //System.out.println(list2.length);
        Arrays.sort(list2);
        for (int i : list2) {
            //System.out.print(i + " ");
        }

        // ARRAYLIST

        List liste = new ArrayList();  // tanım 1
        List<String> liste2 = new ArrayList<>(); // tanım 2

        liste.add("Bu bir string");
        liste.add(1);
        System.out.println(liste.size());
        liste.remove(1);
        liste.get(0);


    }

}
