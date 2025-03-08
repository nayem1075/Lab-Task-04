
package com.mycompany.debabratasir;

import java.util.Scanner;


public class Rotate_Matrix_90_Degree {
    
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
        
        System.out.println("\nOriginal Matrix : ");
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                System.out.print(" "+matrix[i][j]);
            }
            System.out.println();
        }
        
        for(int i=0; i<row; i++){
            for(int j=i; j<row; j++){
                
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
                
            }
        }
        
        for(int i=0; i<row; i++){
            
            int start = 0;
            int end = row-1;
            
            while(start < end){
             
            int temp = matrix[i][start];
            matrix[i][start] = matrix[i][end];
            matrix[i][end] = temp;
                
            start++;
            end--;
            }
        }
       
        System.out.println("\nAfter matrix 90 degree rotation : ");
        
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                System.out.print(" "+matrix[i][j]);
            }
            System.out.println();
        }
        input.close();
        
}
}
