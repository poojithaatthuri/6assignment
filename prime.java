package com.bridzelabz;
import java.util.Scanner;
public class prime {
        public static void main(String args[]){
            boolean isPrime = true;
            Scanner scanner=new Scanner(System.in);
            System.out.println("enter the number:");
            int num=scanner.nextInt();

            for(int i=2; i<=num/2 ; i++   )
            {
                if(num % i == 0)
                {
                    isPrime=false;
                    break;
                }
            }

            if(isPrime)
                System.out.println(num+" is Prime");
            else
                System.out.println(num+"is not Prime");



    }





}
