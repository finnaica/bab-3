/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bab.pkg3;

/**
 *
 * @author finnaica
 */
public class A {
   public static final int max = 100;
   public static final int min = 0;
   public static int bil1;
   public static int bil2;
   public static String hasil;
   
   public void setBanding(int bil1, int bil2){
       this.bil1 = bil1;
       this.bil2 = bil2;
       if(bil1>bil2){
           hasil = "Bil1 lebih besar dari Bil2";
       }
       else if(bil1<bil2){
           hasil = "Bil2 lebih besar daru Bil1";
       }
       else{
           hasil = "Bil1 dan Bil2 sama besar";
       }
   }
   public String getBanding(){
       return hasil;
   }
}
