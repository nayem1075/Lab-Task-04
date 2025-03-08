
package com.mycompany.debabratasir;


public class Maximum_And_Minimum_Number {
    
    public static void main(String[] args) {
        
       
        int [][] array = {{10,15,13},{5,7,13},{11,21,31}};
        
       
        int maximum = array[0][0];
        int minimum = array[0][0];
        
       
        for(int row=0; row<3; row++){
            for(int column=0; column<3; column++){
                if(maximum<array[row][column]){
                    maximum = array[row][column];
                }
                if(minimum>array[row][column]){
                    minimum = array[row][column];
                }
            }
        }
        

        System.out.println("Minimum number of 2D array = "+minimum);
        System.out.println("Maximum number of 2D array = "+maximum);
        
        
    }
    
}
