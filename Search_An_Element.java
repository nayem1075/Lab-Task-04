
package com.mycompany.debabratasir;
import java.util.Scanner;

public class Search_An_Element {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int [][] array = {{20,50,43,44},{53,65,77,89},{101,138,153,651}};
        
        System.out.print("Enter the number to find position : ");
        int number = input.nextInt();
        
        boolean found = false;
        for(int row=0; row<array.length; row++){
            for(int column=0; column<array[row].length; column++){
                
                if(array[row][column]==number){
                    System.out.println("Number "+number+" found at position : (" + row +" , "+column+")");
                found = true;
            }
        }
    }
        
        if(found==false){
            System.out.println("Number "+number+" not found");
        }
        
      input.close();
        
  }
}
