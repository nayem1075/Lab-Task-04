
package com.mycompany.debabratasir;

import java.util.Scanner;

public class Matrix_Boundary_Elements_Printing {
 
     public static void main(String[] args) {
   
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter row and column number : ");
        int row = input.nextInt();
        int column = input.nextInt();
        
        int [][] matrix = new int[row][column];
        
       
   
        System.out.println("Enter the elements of Matrix : ");
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                System.out.printf("array[%d][%d] = ",i,j);
                matrix[i][j] = input.nextInt();
            }
        }
    
           System.out.println("\n\nMatrix : ");
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                System.out.print(" "+matrix[i][j]);
            }
            System.out.println();
        }
        
         System.out.println("\n\nBoundary Elements : ");
        
        for(int i=0; i<column; i++){
            System.out.print(" "+matrix[0][i]);
        }
        
        for(int i=1; i<row-1; i++){
            
            System.out.print(" "+matrix[i][column-1]);
        }
 
        if(row>1){
            for(int i= column-1; i>=0; i--){
                System.out.print(" "+matrix[row-1][i]);
            }
        }
       
                if(column>1){
            for(int i= row-2; i>0; i--){
                System.out.print(" "+matrix[i][0]);
            }
        }
                input.close();
}
}
