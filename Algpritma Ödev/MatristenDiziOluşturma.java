/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.util.Arrays;
import java.util.Scanner;
public class MatristenDiziOluşturma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Satır Sayısını Giriniz: ");
        int st = input.nextInt();
        System.out.println("Lütfen Sütun Sayısını Giriniz: ");
        int sü = input.nextInt();
        int çarpım = 1;
        
        int[][] matris = new int[st][sü];
        int[] b = new int[st];
        
        for (int i = 0; i < st; i++) 
        {
            for (int j = 0; j < sü; j++) 
            {
                System.out.println("A Matrisi için " + (i + 1) + ". ve " + (j + 1)+ ". Giriniz.");
                matris[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < sü; i++) 
        {
            for (int j = 0; j < st; j++) 
            {
             çarpım *= matris[j][i];    
            }
            b[i] = çarpım;
            System.out.println(b[i]);
            çarpım = 1;
        }
        
    }
    
}
