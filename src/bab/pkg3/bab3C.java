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

public class bab3C {
    private static final int max = 5;
    private static final int hargaBakso = 10000;
    private static int a;
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        for(a=0;a<max;a++){
            System.out.printf("Harga Bakso %d porsi : Rp. %d \n",a+1,(a+1)*hargaBakso);
        }        
    }
}
