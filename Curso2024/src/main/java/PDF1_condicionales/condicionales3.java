/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PDF1_condicionales;

import java.util.Scanner;

/**
 * @author Ramon
 * Vamos a perfeccionar la aplicación anterior pidiendo un nombre de usuario y una contraseña 
para permitir el acceso al ordenador. 
El programa guardará el nombre de usuario y la contraseña necesarias en las constantes 
NOMBRE_REQUERIDO, PASSWORD_REQUERIDO. 
Si el nombre de usuario y la contraseña introducidas coinciden con los de estas constantes, 
aparecerá el mensaje "Acceso permitido". En caso contrario se escribirá "Acceso denegado".
 */
public class condicionales3 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 3");
        System.out.println("============");
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        
        // If de una sola linea para una sola condicion
        String resultado = (num % 2 == 0) ? "par" : "impar";
        System.out.println("El numero: " + num + " es " + resultado);
        System.out.println("Fin");
        sc.close();
    }
}
