
//I need to read spaces (present before string and after String) given as input using Scanner Note : if there is no spaces given in input it should not add space in output

//Please find the below code:

//package practise;

import java.util.Scanner;

public class scanccls {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
         String name= scan.nextLine();
        name+=scan.nextLine();
         scan.close();

        System.out.println("Enter your name"+name); 

    }

}