
package com.mycompany.debabratasir;

import java.util.Scanner;


public class Matrix_Multiplication {
     public static void main(String[] args){
        
        Scanner User = new Scanner(System.in);
        int r1,r2,c1,c2,i,j,k,sum=0;
        
        System.out.print("Enter row for first Matrix : ");
        r1 = User.nextInt();
        System.out.print("Enter column for first Matrix : ");
        c1 = User.nextInt();
        System.out.print("Enter row for Second Matrix : ");
        r2 = User.nextInt();
        System.out.print("Enter row for second Matrix : ");
        c2 = User.nextInt();
        
        while(c1!=r2){
            
        System.out.println("Error !! column of first matrix not equal row of second matrix");
            
        System.out.print("Enter row for first Matrix : ");
        r1 = User.nextInt();
        System.out.print("Enter column for first Matrix : ");
        c1 = User.nextInt();
        System.out.print("Enter row for Second Matrix : ");
        r2 = User.nextInt();
        System.out.print("Enter row for second Matrix : ");
        c2 = User.nextInt();
        }
        
        int[][] A = new int[r1][c1];
        int[][] B = new int[r2][c2];
        int[][] Result = new int[r1][c2];
        
        System.out.println("Enter elements for A Matrix : ");
        for(i=0; i<r1; i++){
            for(j=0; j<c1; j++){
                
                System.out.printf("A[%d][%d] = ",i,j);
                A[i][j] = User.nextInt();
            }
        }
        System.out.println("Enter elements for B Matrix : ");
        for(i=0; i<r2; i++){
            for(j=0; j<c2; j++){
                
                System.out.printf("B[%d][%d] = ",i,j);
                B[i][j] = User.nextInt();
            }
        }
        
       for(i=0; i<r1; i++){
           for(j=0; j<c2; j++){
               for(k=0; k<c1; k++){
                   
                   sum = sum + A[i][k] * B[k][j];
               }
               Result[i][j] = sum;
               sum=0;
           }
       }
       
       System.out.println("\n\nA = ");
       for(i=0; i<r1; i++){
           for(j=0; j<c1; j++){
               
               System.out.print(" "+A[i][j]);
               
           }
           System.out.println();
       }
       
           System.out.println("\n\nB = ");
       for(i=0; i<r2; i++){
           for(j=0; j<c2; j++){
               
               System.out.print(" "+B[i][j]);
               
           }
           System.out.println();
       }
           System.out.println("\n\nA X B = ");
       for(i=0; i<r1; i++){
           for(j=0; j<c2; j++){
               
               System.out.print(" "+Result[i][j]);
               
           }
           System.out.println();
       }
       User.close();
    }
}
