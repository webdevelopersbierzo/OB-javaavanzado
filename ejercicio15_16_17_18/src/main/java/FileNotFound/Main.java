package FileNotFound;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Abrimos un Buffer para acceder al fichero

        FileReader file;
        String texto = "";


        try {
            file = new FileReader("ficheros.txt");
            int c = 0;

            try {
                c = file.read();
            } catch (IOException e) {
                System.out.println(" ha habido un error de lectura ");
            }

            while (c != -1) {
                texto = texto + (char) c;
                try {
                    c = file.read();
                } catch (IOException e) {
                    System.out.println("Ojo: no se ha podido completar la lectura");
                }
            }
            file.close();
        } catch (FileNotFoundException e) {
            System.out.println("No ha sido posible acceder al fichero "+ e.getMessage());
        } catch (IOException e) {
            System.out.println(" No se ha podido cerrar el fichero");
        }
        System.out.println(texto);
    }

}




