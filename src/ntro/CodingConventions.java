/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ntro;

public class CodingConventions 
{
    private String name;
    private String description;
    
    
    
    
    /*
        this is a constructor, it works like a method except the return type is an instance 
    */
    public CodingConventions(String name,int descriptionIndex)
    {
       this.name = name;
       description = Main.DESCRIPTIONS[descriptionIndex];
    }
    //normal method
    public void doStuff()
    {
        String output = name + description;
        System.out.println(output);
    }
}
