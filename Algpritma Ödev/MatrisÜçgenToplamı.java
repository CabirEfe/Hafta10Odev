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
public class MatrisÜçgenToplamı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Matrisiniz Kaç Kaçlık Bir Matris Olsun: ");
        int st = input.nextInt();
        int sü = st;
        int toplam = 0;
        int[][] matris = new int[st][sü];
        
        
        for (int i = 0; i < st; i++) 
        {
            for (int j = 0; j < sü; j++) 
            {
               System.out.println("A Matrisi için " + i + ". ve " + j + ". Giriniz.");
                matris[i][j] = input.nextInt();
            }
         }
        for (int i = 0; i < st; i++) 
        {
            for (int j = 0; j < sü; j++) 
            {
             if((i + j) < (st + 1))
             {
              toplam += matris[i][j];
             }   
            }
        }
        System.out.println("Matristeki Üçgen Üzerindeki Sayıların Toplamı= " + toplam);
    }
    
}
