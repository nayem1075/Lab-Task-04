
package com.mycompany.debabratasir;

import java.util.Scanner;


public class Symmetric_Matrix {
    public static void main(String[] args) {
   
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter row and column number : ");
        int row = input.nextInt();
        int column = input.nextInt();
        
                
        if(row!=column){
            System.out.println("It is not symmetric matrix (Row and Column must be equal)");
            return;
        }
         int [][] matrix = new int[row][column];
                        
        System.out.println("Enter the elements of Matrix : ");
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                System.out.printf("array[%d][%d] = ",i,j);
                matrix[i][j] = input.nextInt();
            }
        }
        
        boolean symmetric = true;
        
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                
               if(matrix[i][j] != matrix[j][i]){
                   symmetric = false;
                   break;
               }
        }
            if(!symmetric){
                break;
            }
    }

        
        System.out.println("\n\nOriginal Matrix : ");
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                System.out.print(" "+matrix[i][j]);
            }
            System.out.println();
        }
        
        if(symmetric){
            System.out.println("\n\nIt is symmetric matrix.");
        }
        else{
            System.out.println("\n\nIt is not symmetric matrix.");
        }
        
        
        input.close();
    }
        
}
