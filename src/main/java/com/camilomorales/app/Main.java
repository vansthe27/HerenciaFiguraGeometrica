package com.camilomorales.app;

import com.camilomorales.dominio.Circulo;
import com.camilomorales.dominio.Cuadrado;
import com.camilomorales.dominio.FiguraGeometrica;
import com.camilomorales.dominio.Triangulo;

public class Main {
    public static void main(String[] args) {
        //Circulo circulo = new Circulo("Círculo", 5.0);
        //Triangulo triangulo = new Triangulo("Triángulo", 4.0, 3.0);
        //Cuadrado cuadrado = new Cuadrado("Cuadrado", 6.0);
        Circulo circulo = new Circulo("Circulo",6.5);
        Triangulo triangulo = new Triangulo("Triangulo",8.3,5);
        Cuadrado cuadrado = new Cuadrado("Cuadrado",10);

        System.out.println("Figura: " + circulo.getNombre() + ", Radio: " + circulo.getRadio());
        System.out.println("Figura: " + triangulo.getNombre() + ", Base: " + triangulo.getBase() + ", Altura: " + triangulo.getAltura());
        System.out.println("Figura: " + cuadrado.getNombre() + ", Lado: " + cuadrado.getLado());
    }
}

