/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bab.pkg3;

/**
 *
 * @author finnaica
 */
import java.util.Scanner;

public class bab3A {
    public static void main(String[] args){
        A pindah = new A();
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input Bil1 : ");
        int bil1 = input.nextInt();
        System.out.print("Input Bil2 : ");
        int bil2 = input.nextInt();

            pindah.setBanding(bil1, bil2);
            pindah.getBanding();
        
    }
}
