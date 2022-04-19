import java.util.Scanner;

public interface Figuritas {

    class Cuadradito {
        int lado;

        int getArea() {
            return lado * lado;
        }

        int getPerimeter() {
            return lado * 4;
        }
    }

    class Circulo {
        double r;

        double getArea() {
            return Math.PI * Math.pow(r, 2);
        }

        double getPerimeter() {
            return 2 * Math.PI * r;
        }
    }

    class Triangulo {
        int lado;

        int getArea() {
            return (lado * lado)/2;
        }

        int getPerimeter() {
            return lado * 3;
        }
    }

    public class Main {

        public static void main(String args[]) {

            int o;
            Scanner leer=new Scanner(System.in);
            System.out.println("Bienvenido/a a FIGURITAS.COM");
            System.out.println("Selecciona una opción :D");

            System.out.println("1: Área Cuadrado");
            System.out.println("2: Perímetro Cuadrado");
            System.out.println("3: Área Círculo");
            System.out.println("4: Perímetro Círculo");
            System.out.println("5: Área Tríangulo");
            System.out.println("6: Perímetro Tríangulo");
            o=leer.nextInt();

            switch (o){
                case 1:

                    Cuadradito mybox1 = new Cuadradito();
                    int area;
                    int l;

                    System.out.println("Dame el valor del lado: ");
                    l=leer.nextInt();

                    mybox1.lado = l;

                    area = mybox1.getArea();
                    System.out.println("El área del cuadrado es de: " + area);
                    break;

                case 2:

                    Cuadradito mybox2 = new Cuadradito();
                    int Perimeter;

                    System.out.println("Dame el valor del lado: ");
                    l=leer.nextInt();
                    mybox2.lado = l;

                    Perimeter = mybox2.getPerimeter();
                    System.out.println("El perimetro del cuadrado es de: " + Perimeter);
                    break;

                case 3:

                    Circulo mybox3 = new Circulo();
                    int ra;

                    System.out.println("Dame el valor del radio: ");
                    ra=leer.nextInt();
                    mybox3.r = ra;

                    area = (int) mybox3.getArea();
                    System.out.println("El área del círculo es de: " + area);
                    break;

                case 4:

                    Circulo mybox4 = new Circulo();

                    System.out.println("Dame el valor para comenzar: ");
                    ra=leer.nextInt();
                    mybox4.r = ra;

                    Perimeter = (int) mybox4.getPerimeter();
                    System.out.println("El perimetro del círculo es de: " + Perimeter);
                    break;

                case 5:

                    Triangulo mybox5 = new Triangulo();
                    System.out.println("Dame el valor del lado: ");
                    l=leer.nextInt();

                    mybox5.lado = l;

                    area = mybox5.getArea();
                    System.out.println("El área del triangulo es de: " + area);
                    break;

                case 6:

                    Triangulo mybox6 = new Triangulo();
                    System.out.println("Dame el valor del lado: ");
                    l=leer.nextInt();

                    mybox6.lado = l;

                    Perimeter = mybox6.getPerimeter();
                    System.out.println("El perimetro del triangulo es de: " + Perimeter);
                    break;

            }


        }
    }
}