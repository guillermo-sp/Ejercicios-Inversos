/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inversos;

import java.util.Scanner;

/**
 *
 * @author Usuario DAM 1
 */
public class InVersos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        double num1, num2, num3, sumainversa;
        System.out.println("dame tres numeros");
        num1 = teclado.nextInt();
        num2 = teclado.nextInt();
        num3 = teclado.nextInt();

        if (num1 >= -100 && num1 <= 100 && num2 >= -100 && num2 <= 100 && num3 >= -100 && num3 <= 100) {
            
            double invnum1=0,invnum2=0,invnum3=0;
            if (num1 != 0) {

                invnum1 = 1 / (double)num1;

            }
            if (num2 != 0) {
                invnum2 = 1 / (double)num2;

            }
            if (num3 != 0) {
                invnum3 = 1 / (double)num3;

            }
            
            sumainversa = invnum1+invnum2+invnum3;
            System.out.printf("La suma de las inversas es %.5f",sumainversa);
        } else {

        }
        
        
    }

}
