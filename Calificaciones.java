import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calificaciones{

    public static void main(String[] args) throws IOException
    {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //Nombre del alumno/alumna

        System.out.println("Hola, introduce tu nombre :) ");
        String nombrespuntocom = br.readLine();

        //Introducción de calificaciones

        System.out.println("Introduzca las calificaciones (5): ");
        String entradacali1 = br.readLine();
        String entradacali2 = br.readLine();
        String entradacali3 = br.readLine();
        String entradacali4 = br.readLine();
        String entradacali5 = br.readLine();

        //Lee calificaciones

        int numcalifi1 = Integer.parseInt(entradacali1);
        int numcalifi2 = Integer.parseInt(entradacali2);
        int numcalifi3 = Integer.parseInt(entradacali3);
        int numcalifi4 = Integer.parseInt(entradacali4);
        int numcalifi5 = Integer.parseInt(entradacali5);

        //Obtiene el promedio

        int sumacali = (numcalifi1+numcalifi2+numcalifi3+numcalifi4+numcalifi5)/5;

        //Calificación con letras

        String caliletra = switch (sumacali) {
            case 10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50-> "F";
            case 51,52,53,54,55,56,57,58,59,60-> "E";
            case 61,62,63,64,65,66,67,68,69,70 -> "D";
            case 71,72,73,74,75,76,77,78,79,80 -> "C";
            case 81,82,83,84,85,86,87,88,89,90 -> "B";
            case 91,92,93,94,95,96,97,98,99,100 -> "A";
            default -> "Error";
        };

        System.out.println("Alumno/a:  " + nombrespuntocom);
        System.out.println("Calificación 1: " + numcalifi1);
        System.out.println("Calificación 2: " + numcalifi2);
        System.out.println("Calificación 3: " + numcalifi3);
        System.out.println("Calificación 4: " + numcalifi4);
        System.out.println("Calificación 5: " + numcalifi5);
        System.out.println("Promedio: " + caliletra);
        System.out.println("Calificación Final: " + sumacali);

    }

}