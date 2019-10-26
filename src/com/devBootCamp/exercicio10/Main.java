package com.devBootCamp.exercicio10;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //https://www.4devs.com.br/area_circulo
        var figuraGeometrica = new FiguraGeometrica();

        var areaQuadrado = figuraGeometrica.calcularArea(new Quadrado(10D));
        System.out.println("Área Quadrado: " + areaQuadrado);

        var areaTriangulo = figuraGeometrica.calcularArea(new Triangulo(10D, 20D));
        System.out.println("Área Triangulo: " + areaTriangulo);

        var areaRetangulo = figuraGeometrica.calcularArea(new Retangulo(20D, 10D));
        System.out.println("Área Retangulo: " + areaRetangulo);

        var areaCirculo = figuraGeometrica.calcularArea(new Circulo(10D));
        System.out.println("Área Circulo: " + areaCirculo);

//        var list = new ArrayList<Figura>();
//        list.add(new Quadrado(10D));
//        list.add(new Triangulo(10D, 20D));
//        list.add(new Retangulo(20D, 10D));
//        list.add(new Circulo(10D));
//
//        for (Figura figura : list) {
//            System.out.println("Área: " + figura.getArea());
//        }
    }
}
