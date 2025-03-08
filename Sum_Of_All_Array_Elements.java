
package com.mycompany.debabratasir;

public class Sum_Of_All_Array_Elements {
    
    public static void main(String[] args){
        
      
        int [][] array = {{1,2,3},{4,5,6},{7,8,9}};
        
        int sum = 0;
        
        for(int row=0; row<3; row++){
            for(int column=0; column<3; column++){
                sum = sum+array[row][column];
            }
        }
       
        System.out.println("Sum of all array elements = "+sum);   
    }
    
}
