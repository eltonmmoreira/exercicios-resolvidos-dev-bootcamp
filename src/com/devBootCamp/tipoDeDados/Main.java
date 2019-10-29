package com.devBootCamp.tipoDeDados;

public class Main {

    public static void main(String[] args) {
        String[] array = {"JAVA", "C"};

        for (int i = 0; i < array.length; i++) {
            String s = array[i];
            System.out.println(s);
        }

        String[] a = new String[2];
        a[0] = "TESTE";
        a[1] = "1";
        for (int i = 0; i < a.length; i++) {
            String s = a[i];
            System.out.println(s);
        }

    }
}
