
package com.mycompany.debabratasir;

import java.util.Scanner;

public class Check_Identity_Matrix {

   public static void main(String[] args) {
   
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter row and column number : ");
        int row = input.nextInt();
        int column = input.nextInt();
        
            if(row!=column){
            System.out.println("\nIt is not an Identity matrix (Row and Column must be equal)");
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
        
        System.out.println("\n\nMatrix : ");
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                System.out.print(" "+matrix[i][j]);
            }
            System.out.println();
        }
        
        boolean identity = true;
        
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                if((i==j && matrix[i][j]!=1)||(i!=j&&matrix[i][j]!=0)){
                    identity = false;
                    break;
                }
            }
        }
        
        if(identity){
            System.out.println("\nThe matrix is an Identity Matrix");
        }
        else{
            System.out.println("\nThe matrix is not an Identity Matrix");
        }
        input.close();
        
        }
}
