
package com.mycompany.debabratasir;
import java.util.Scanner;

public class Sum_Row_And_Column {
    
    public static void main(String[] args) {
   
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter row and column number : ");
        int row = input.nextInt();
        int column = input.nextInt();
        
        int [][] array = new int[row][column];
   
        System.out.println("Enter the elements of 2D Array : ");
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                System.out.printf("array[%d][%d] = ",i,j);
                array[i][j] = input.nextInt();
            }
        }
        
        System.out.println("\n\n2D Array : ");
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                System.out.print(" "+array[i][j]);
            }
            System.out.println();
        }
        
        System.out.println("\n\nSum of each rows : ");
        for(int i=0; i<row; i++){
            int rowSum=0;
            for(int j=0; j<column; j++){
                rowSum = rowSum+array[i][j];
            }
              System.out.println("Row "+(i+1)+" = "+rowSum);
        }
     
        System.out.println("\nSum of each Column : ");
        for(int j=0; j<column; j++){
            int columnSum = 0;
            for(int i=0; i<row; i++){
                columnSum = columnSum + array[i][j];
            }
            System.out.println("Column "+(j+1)+" = "+columnSum);
        }
        input.close();
    }
    
}
