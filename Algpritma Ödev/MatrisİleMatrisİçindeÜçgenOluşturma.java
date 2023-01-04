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
import java.util.Arrays;
public class MatrisİleMatrisİçindeÜçgenOluşturma {

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
        int[][] matris2 = new int[st][sü];
        
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
             if(i > j)
             {
              matris2[i][j] = 0;
             }
             else
             {
              matris2[i][j] = matris[i][j];
             }
            }
        }
        //System.out.println(Arrays.deepToString(matris2));
        for (int i = 0; i < st; i++) 
        {
            for (int j = 0; j < sü; j++) 
            {
                System.out.print(matris2[i][j] + " ");    
            }
            System.out.println("");
        }
    }
    
}
