/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aceptaelreto219;

import java.util.Scanner;

/**
 *
 * @author Usuario 1 DAM
 */
public class AceptaelReto219 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numcasos = sc.nextInt();
        int contador;
        for (int i = 0; i < numcasos; i++){
            contador = 0;
            int numdecimos = sc.nextInt();
            for(int j = 0; j < numdecimos; j++) {
                int decimos = sc.nextInt();
                if (decimos%2==0) {
                    contador++;
                }
            }
            System.out.println(contador);
        }
    }
    
}
