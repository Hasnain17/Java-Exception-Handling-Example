/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author Hasnain Gakhar
 */
public class Exceptions 
{
static int i=5;
static int j=5;
static int k;
public static void main(String[] args) 
{
try // if there is ann error in try block then try throws the Exception 
{
    k=i/j;
}
catch(ArithmeticException e) //catcht will caught the exception
        {
          System.out.println("Error");  //we know 5/0 is runtime error so this will run
        }
System.out.println("Result:"+k); //result is zero
}

    
}
