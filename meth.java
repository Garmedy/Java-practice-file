import java.util.*;
import java.util.Scanner;

 public class Dcoder
 { 
   static int plus(int a ,int b){
     return a + b;
   }
   
   static int minus(int a ,int b){
     return a - b;
   }
   
   static int times(int a ,int b){
     return a * b;
   }
   
   static int divide(int a ,int b){
     return a / b;
   }
   
   static void calc(){
   int a , b;
   Scanner sim = new Scanner(System.in);
   
   System.out.println("\nEnter two number: ");
   a = sim.nextInt();
   b = sim.nextInt();
   
   System.out.print("chose what to use: \n");
   System.out.print("|+| |-| |/| |*|\n");
   System.out.print("enter e to exit\n");
   char sup = sim.next().charAt(0);
     
     switch(sup){
         
       case 'e':
         break;
         
       case '+':
         System.out.print(plus(a , b));
         calc();
         break;
       
       case '-':
         System.out.print(minus(a , b));
         calc();
         break;
       
       case '/':
         System.out.print(divide(a , b));
         calc();
         break;
       
       case '*':
         System.out.print(times(a , b));
         calc();
         break;
         
       default:
         System.out.print("invalid input");
         calc();
         break;   
         }
   }
   public static void main(String args[])
   {   
     calc();
   }
 }