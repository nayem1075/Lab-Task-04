
package com.mycompany.debabratasir;

import java.util.Scanner;

public class Matrix_Diagonal_Sum {
     public static void main(String[] args) {
   
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter row and column number : ");
        int row = input.nextInt();
        int column = input.nextInt();
        
        int [][] matrix = new int[row][column];
        int SumOfDiagonal=0;
        
        System.out.println("Enter the elements of Matrix : ");
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                System.out.printf("array[%d][%d] = ",i,j);
                matrix[i][j] = input.nextInt();
            }
        }
        
         for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                
                if(i==j){
                    
                    SumOfDiagonal = SumOfDiagonal + matrix[i][j];
                }
            }
         }
        System.out.println("\n\nMatrix : ");
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                System.out.print(" "+matrix[i][j]);
            }
            System.out.println();
        }
        
         System.out.println("\nSum of Diagonal Elements = "+SumOfDiagonal);
         
         input.close();
     }
}
