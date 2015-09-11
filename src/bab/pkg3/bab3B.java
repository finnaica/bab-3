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

public class bab3B {
    private double panjang;
    private double lebar;
    private static double luas;
    private static double keliling;
    
    public void setPanjang(double panjang){
        this.panjang = panjang;
    }
    
    public void setLebar(double lebar){
        this.lebar = lebar;
    }
    
    public double getLuas(){
        return luas = panjang*lebar;
    }
    
    public double getKeliling(){
        return keliling = 2*(panjang+lebar);
    }
    public static void main(String[] args){
        bab3B panggil = new bab3B();
        Scanner input = new Scanner(System.in);
        
        System.out.printf("Panjang : ");
        panggil.panjang = input.nextDouble();
        System.out.printf("Lebar   : ");
        panggil.lebar = input.nextDouble();
        panggil.setPanjang(panggil.panjang);
        panggil.setLebar(panggil.lebar);
        System.out.println("Luas     : "+panggil.getLuas());
        System.out.println("Keliling :"+panggil.getKeliling());
        
    }
}
