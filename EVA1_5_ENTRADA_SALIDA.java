/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_5_entrada_salida;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_5_ENTRADA_SALIDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaracion de variables
        String nombre;
        String apellidos;
        int semestre;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduce tu nombre");
        nombre = input.nextLine();
        System.out.println("Introduce tu apellidos");
        apellidos = input.nextLine();
        System.out.println("Introduce tu semestre");
        semestre = input.nextInt();
        
        System.out.println(nombre);
        System.out.println(apellidos);
        System.out.println(semestre);
    }
    
}
