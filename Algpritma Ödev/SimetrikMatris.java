
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class SimetrikMatris {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Matrisiniz Kaç Kaçlık Bir Matris Olsun: ");
        int st = input.nextInt();
        int sü = st;
        int kontrol = 0;
        
        int[][] matris = new int[st][sü];
        
        
        for (int i = 0; i < st; i++) 
        {
            for (int j = 0; j < sü; j++) 
            {
                System.out.println("A Matrisi için " + i + ". ve " + j + ". Giriniz.");
                matris[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < 10; i++) 
        {
            for (int j = 0; j < 10; j++) 
            {
             if(matris[i][j] == matris[j][i])
             {
              
             }
             else
             {
              System.out.println("Simetrik Değildir.");
              break;
             }
            }
        }
          System.out.println("Simetriktir");       
    }
    
}
