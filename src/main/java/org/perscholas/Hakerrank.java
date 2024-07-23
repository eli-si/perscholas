package org.perscholas;


import java.util.Scanner;

public class Hakerrank {




        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);

            System.out.println("Inter 2 words");
            String A=sc.next();
            String B=sc.next();

            System.out.println(Integer.sum(A.length(),B.length()));
            if ((B.compareTo(A))>(B.compareTo(A))) {
                System.out.println("Yes");
            }
            else {System.out.println("No");}

            System.out.println((new StringBuilder().append(A.substring(0, 1).toUpperCase()).append(A.substring(1)).toString()) +" "+(B.substring(0,1).toUpperCase() + B.substring(1)));


            /* Enter your code here. Print output to STDOUT. */

        }

}
