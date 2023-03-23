/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Notas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File fichero = new File("fichero_leer.txt");
        Scanner s = null;
        try {
            // Leemos el contenido del fichero
            System.out.println("... Leemos el contenido del fichero ...");
            s = new Scanner(fichero);

            // Leemos linea a linea el fichero
            while (s.hasNextLine()) {
                String linea = s.nextLine(); 	// Guardamos la linea en un String
                System.out.println(linea);      // Imprimimos la linea
            }

        } catch (Exception ex) {
            System.out.println("Mensaje: " + ex.getMessage());
        } finally {
            // Cerramos el fichero tanto si la lectura ha sido correcta o no
            try {
                if (s != null) {
                    s.close();
                }
            } catch (Exception ex2) {
                System.out.println("Mensaje 2: " + ex2.getMessage());
            }
        }
        String[] lineas = {"Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "..."};

        /**
         * FORMA 1 DE ESCRITURA *
         */
        FileWriter fichero1 = null;
        try {

            fichero1 = new FileWriter("fichero_escritura.txt");

            // Escribimos linea a linea en el fichero
            for (String linea : lineas) {
                fichero1.write(linea + "\n");
            }

            fichero1.close();

        } catch (Exception ex) {
            System.out.println("Mensaje de la excepción: " + ex.getMessage());
        }
    }

}
