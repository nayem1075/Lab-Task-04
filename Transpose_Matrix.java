
package com.mycompany.debabratasir;

import java.util.Scanner;


public class Transpose_Matrix {
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
        
        int [][] transpose = new int[column][row]; 
        
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                
                transpose[j][i] = matrix[i][j];
        }
    }
        
        System.out.println("\n\nOriginal Matrix : ");
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                System.out.print(" "+matrix[i][j]);
            }
            System.out.println();
        }
        
        System.out.println("\nTranspose of the matrix : ");
        
        for(int i=0; i<column; i++){
            for(int j=0; j<row; j++){
                System.out.print(" "+transpose[i][j]);
            }
            System.out.println();
        }
        input.close();
    }
}
