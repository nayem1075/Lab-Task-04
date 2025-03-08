
package com.mycompany.debabratasir;

public class Print_2D_Array {
    
    public static void main(String[] args){
        
        
        int [][] array = {{1,2,3},{4,5,6},{7,8,9}};
        
        System.out.println("2D Array Elements : ");
        
      
        for(int row=0; row<3; row++){
            for(int column=0; column<3; column++){
                System.out.print(" "+array[row][column]);
            }
            System.out.println();
        }
        
    }
    
}
