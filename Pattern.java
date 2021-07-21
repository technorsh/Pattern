/**
    Lab Assignment

    Pattern :-
        
        *1234      
        1*123      
        12*12
        123*1
*/

import java.util.Scanner;

class Pattern{
    public static void main( String args[]){

        System.out.print("Enter Size of Pattern : ");

        Scanner sc = new Scanner(System.in); // Scanner - For input from the user
        int n = sc.nextInt(); 

        int counter;

        for( int i = 0; i < n; i++ ){
            counter = 1;
            for( int j = 0; j < n; j++, counter++ ){
                
                if( i == j ){     
                    System.out.print("*");
                    counter = 1;
                }

                System.out.print(counter);
                
            }
            System.out.print("\n");
        }
        
    }
}