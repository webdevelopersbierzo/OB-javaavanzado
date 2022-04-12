package arrayIndexOutOfBounds;

import java.sql.Array;

public class Main {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5,6};
        try{
            System.out.println(numeros[8]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("No se ha encontrado el elemento estas fuera del array : Error" + e.getMessage());
        }
    }
}
