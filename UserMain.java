/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab7;
import java.util.Scanner;

/**
 *
 * @author mariam
 */
public class UserMain {
    
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Please enter the component: \n");
        

        String component;
        CompArray compArray=new CompArray();
        do
        { 
            component=scanner.nextLine();
            String[] components=component.split("\\s+");
        
            if(!component.equals("end"))
            {
               if(components.length!=4 && !component.equals("spice"))
                {
                    throw new IllegalArgumentException("You must input either four values, 'spice' or 'end'.");
                }
               
            }
                 

           
       //filter through and parse user input
     
        if(component.startsWith("r") || component.startsWith("v")) // if it starts with r
        {
            String type= components[0];
            
            int[] intnodes= new int[components.length];
            for(int i=1; i<3; i++)
            {
                 intnodes[i]=Integer.parseInt(components[i]);
            }
        
            double[] doublevalue= new double[components.length];
            for(int j=3; j<4; j++)
             {
                doublevalue[j]= Double.parseDouble(components[j]);
             }        
             
            Circuit circuit= new Circuit(type, intnodes[1], intnodes[2], doublevalue[3]);
            compArray.addCircuit(circuit);
        
        }

        else if(component.equals("spice"))
        {
            System.out.print("" + compArray.toString());
        }
        
        else if(component.equals("end"))
        {
            System.out.print("All done." + "\n");
        }
        
        } while(!component.equals("end"));
        
    
        } 
    
    
}
