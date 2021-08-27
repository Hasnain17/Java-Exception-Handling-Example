/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions.ExceptionB;

/**
 *
 * @author Hasnain Gakhar
 */
import java.io.IOException;
import java.util.*;
public class ABC 
{
static int arr[]=new int [4];
static int a=5;
static int b=2;
   static int k;
   public static void main(String args[]) throws IOException //it is used for surpres the error if 
   {                                                         //we don't know about error then we right it 
                                                             //In this we IOexcption and import the package 
   Scanner abc=new Scanner(System.in);
   int d;
   d=abc.nextInt();
   if(d>=5)
   {
       throw new ArithmeticException(); //throw the exception
   }
       try //Critical statements are executed in Try if 
           // it there is no error in code then catch will ignore otherwise   
           //if error is occured then exception is thrown which will be catch by
           //catch. and in catch the code will execute which is written.
           
       {
       k=a/b;
       System.out.println("Value in K is:"+k);
        for(int i=0;i<=5;i++)
    {
        arr[i]=i;
    }
        for(int i=0;i<=3;i++)
    {
        System.out.println("Value:"+arr[i]+"\n");
    }
   }
   
       catch(ArrayIndexOutOfBoundsException e)
   {
       System.out.println("\nonly 4 value can store:"+e);
   }
   
   catch(ArithmeticException e)
   {
       System.out.println("Number should not be divide by 0:"+e);
   }
   finally //by using finally we can run the statement after try in both condition if statements errorless or not it run in both conditions.
   {
       System.out.println("++\nHasnain Bye Bye+++");
   }
   
      

   }
}
