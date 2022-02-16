public class Operaciones {

    public String zz= "wwww";

    public static void main(String[] args){

        int num1 = 27;
        String valor_x = "Valor X: " + String.valueOf(num1);
        System.out.println(valor_x);

        int num2 = 14;
        String valor_y = "Valor Y: "+ String.valueOf(num2);
        System.out.println(valor_y);

        //Suma
        int suma = num1 + num2;
        String sumita = "Suma: "+ String.valueOf(suma);
        System.out.println(sumita);

        // Resta
        int resta = num1 - num2;
        String resti = "Resta: " + String.valueOf(resta);
        System.out.println(resti);

        //Multiplicación
        double multiplicacion = num1 * num2;
        String multi = "Multiplicación: " + String.valueOf(multiplicacion);
        System.out.println(multi);

        //División
        double division = num1 / num2;
        String divi = "División: " + String.valueOf(division);
        System.out.println(divi);

        //Modúlo
        double modulo = num1 % num2;
        String modu = "Módulo: " + String.valueOf(modulo);;
        System.out.println(modu);

    }

}//-- FIN DE CLASE