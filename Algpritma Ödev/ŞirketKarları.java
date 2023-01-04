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
public class ŞirketKarları {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Satır Sayısını Giriniz: ");
        int st = input.nextInt();
        int toplam = 0;
        int[][] karlar = new int[st][12];
        int[] oran = new int[st];
        int ezk; int ezka; int efk; int efka;
        int fz; int az; int fzş; int azş;
        for (int i = 0; i < st; i++) 
        {
            for (int j = 0; j <= 12; j++) 
            {
             System.out.println("Kar Oranları için " + i + ". ve " + j + ". Giriniz.");
             karlar[i][j] = input.nextInt();       
            }
        }
        for (int i = 0; i < st; i++) 
        {
            for (int j = 1; j <= 12; j++) 
            {
             toplam += karlar[i][j];    
            }
            oran[i] = toplam;
        }
        for (int i = 0; i < st; i++) 
        {
             ezk = karlar[0][0];
             efk = karlar[0][1];
             ezka = 0;
             efka = 0;
            for (int j = 1; j <= 12; j++) 
            {
             if(karlar[i][j] < ezk)
             {
              ezk = karlar[i][j];
              ezka = j;
             }
             if(karlar[i][j] > efk)
             {
              efk = karlar[i][j];
              efka = j;
             }
            }
        }
        for (int i = 1; i <= 12; i++) 
        {
             fz = karlar[1][1];
             az = karlar[1][2];
             fzş = 0;
             azş = 0;
            for (int j = 0; j < st; j++) 
            {
             if(karlar[i][j] < az)
             {
              az = karlar[i][j];
              azş = j;
             }
             if(karlar[i][j] > fz)
             {
              fz = karlar[i][j];
              fzş = j;
             }
            }
        }
        for (int i = 0; i < oran.length; i++) 
        {
          System.out.println("Şirketlerin Kar Oranı= " + oran[i]);   
        }
        System.out.println("Şirketlerin En Fazla Elde Ettiği Ay ve Kar Oranı= " + efka + " , " + efk);
        System.out.println("Şirketlerin En Az Elde Ettiği Ay ve Kar Oranı= " + ezka + " , " + ezk);
        System.out.println("Aylar Arasında En Fazla Kar Eldesi ve Şirketi= " + fz + " , " + fzş);
        System.out.println("Aylar Arasında En Az Kar Eldesi ve Şirketi= " + az + " , " + azş);
    }
    
}
