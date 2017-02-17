/**
 * Created by teo on 16/02/2017.
 */

public class TestTriangulo {


    double s = 0;
    double area = 0;

    public boolean validar(Triangulos T) {
        if ((T.getA() + T.getB()) < T.getC()) {
            return false;
        } else {
            return true;
        }

    }

    public String Area(Triangulos T) {

        if ( validar(T))
        {
            int a, b, c;
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

    public String Ejemplo1(){
        Triangulos T = new Triangulos();

        T.setA(3);
        T.setB(4);
        T.setC(5);

        return Area(T);
    }

    public String Ejemplo2(){
        Triangulos T = new Triangulos();

        T.setA(3);
        T.setB(1);
        T.setC(5);

        return Area(T);
    }



}
