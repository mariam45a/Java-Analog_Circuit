/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab7;
import java.util.ArrayList;
/**
 *
 * @author mariam
 */
public class CompArray {
    
    ArrayList<Circuit> comps;
    
    
    public CompArray()
    {
        this.comps=new ArrayList<Circuit>();
    }
    
    
   public void addCircuit(Circuit circuit)
    {
       this.comps.add(circuit);
    }
    
    
    @Override
    public String toString()
    {
        String c=new String();
        int size=this.comps.size();
        
        for(int i=0; i<size; i++)
        {
            c+=this.comps.get(i).toString() + "\n";
        }
        return c;
    }
    
}
