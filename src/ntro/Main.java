/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ntro;

/**
 *
 * @author nasir
 */
public class Main 
{   
    public static final String[] DESCRIPTIONS = {"is a student","is a teacher"};
    public static void main(String[] args)
    {   
        String[] name = ["lebron ","Kobe "]
       /*
        this is an decoration of an instance of coding conventions
        in the same line of code it is also being instantiated
        note the use of the word new
        */
        /*
        local variables are not fields
        after the method they are destoyed
        */
        /*
           instance method call(the method belongs to the instance not the class)
        */
        int numberOfLoops = 10;
        for(int i = 0; i < numberOfLoops;i++)
        {
            CodingConventions conventionInstance = new CodingConventions(, i%2);
            conventionInstance.doStuff();
        }
           
    }
    
}
