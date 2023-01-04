/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.util.Scanner;
public class MatrisÖncekiElemanToplamı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Matrisin Kaça Kaçlık Olacağını Belirleyiniz: ");
        int st = input.nextInt();
        int sü = st;
        
        int[][] matris = new int[st][sü];
        
        for (int i = 0; i < st; i++) 
        {
            for (int j = 0; j < sü; j++) 
            {
             System.out.println("A Matrisi için " + i + ". ve " + j + ". Giriniz.");
             matris[i][j] = input.nextInt();   
            }
        }
        int toplam = 0;
        
        for (int i = 0; i < st; i++) 
        {
            for (int j = 0; j < sü; j++) 
            {
             toplam += matris[i][st - 1] + matris[st - 1][i];     
            }
        }
        System.out.println(toplam - matris[st - 1][st - 1]);   
    }
    
}
