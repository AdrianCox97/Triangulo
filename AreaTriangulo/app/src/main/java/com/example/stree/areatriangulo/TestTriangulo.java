package com.example.stree.areatriangulo;

public class TestTriangulo {


    double s = 0;
    double area = 0;

    public boolean validar(Triangulo T) {
        if ((T.getA() + T.getB()) < T.getC()) {
            return false;
        } else {
            return true;
        }

    }

    public String Area(Triangulo T) {

        if ( validar(T))
        {
            double a, b, c;
            a = T.getA();
            b = T.getB();
            c = T.getC();

            s = (a + b + c)/2;

            area = Math.sqrt(s * (s - a ) * (s - b) * (s - c));
        }
        else {
            return "No es un triángulo";
        }

        return String.valueOf(area);
    }
}