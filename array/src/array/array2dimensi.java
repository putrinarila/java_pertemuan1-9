/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author ACENKCOM
 */
public class array2dimensi {
    public static void main(String[] args) {
        String [][]huruf= {
            {"A","B","C"},
            {"D","E","F"},
            {"G","H","I"},   
        };
        
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print (huruf [i][j]+" ");
            }
            System.out.println();
    }
}
}