package Arithmeticexception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double resultado = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el dividendo: ");
        int dividendo = sc.nextInt();
        System.out.println("Introduce el divisor");
        int divisor = sc.nextInt();
        try{
            resultado  = dividendo / divisor;
        }catch (ArithmeticException e){
            System.out.println("Error: division por 0" + e.getMessage());
        }
        System.out.println("-> " + dividendo + "/" + divisor + " = " + resultado);
    }
}
