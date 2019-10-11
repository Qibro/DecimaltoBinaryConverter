package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Desc_Bin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> binary = new ArrayList<>();
        System.out.print("Descimal to Binary Converter :\n" +
                           "Input Decimal(Input > 0) : ");
        int decimal = sc.nextInt();
        for (int i = decimal; i > 0 ; i /= 2) {
            binary.add(i%2);
        }
        for (int i = binary.size(); i >0 ; i--) {
            System.out.print(binary.get(i-1));
        }
    }
}
