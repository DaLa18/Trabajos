import java.util.Scanner;

public class algoritmos {

    public static void main(String[] args) {




        //Pedir numero límite serie

        Scanner sc = new Scanner(System.in);
        System.out.print("Coloca el número límite para los numeros primos: ");
        int num = sc.nextInt();
        System.out.print("Coloca el número límite para la serie Fibonacci: ");
        int limite = sc.nextInt();
        sc.close();

        //Imprimir num primos

        {
            //Imprimir la serie Fibonacci
            System.out.println("Serie de números primos: ");
            if (num <= 0) {
                System.out.println("da otro numero más grande");
            } else {
                int cant_divisores = 0;
                int i = 1;
                while (i <= num) {

                    i++;
                }
            }

        }


        //Imprimir la serie Fibonacci
        System.out.println("Sucesión de Fibonacci: ");

        for(int i = 0; i<limite; i++){

            System.out.print(funcionFibonacci(i) + ", ");
        }
    }

    //metodo de la serie

    private static int funcionFibonacci(int num){
        if(num == 0 || num==1)
            return num;
        else
            return funcionFibonacci(num-1) + funcionFibonacci(num-2);
    }

}