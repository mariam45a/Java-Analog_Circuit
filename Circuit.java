/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab7;

/**
 *
 * @author mariam
 */
public class Circuit {
   public String type_;
   public int n1;
   public int n2;
   public String volt_type;
   public double value;
   public int comp_id;
   private static int count_res=1;
   private static int count_volt=1;
    
    
   public Circuit(String type_, int n1, int n2, double value)
   {
       if("v".equals(type_) && value<0)
       {
           //swap the nodes so it is positive
           int temp;
           temp=n1;
           n1=n2;
           n2=temp;
           
           value=value*(-1);
       }
       
        if("r".equals(type_))
       {
           type_="R";
           volt_type="";
       }
       
        else 
        {
            type_="V";
            volt_type="DC";
        }
       
       
       
       this.type_=type_;
       this.n1=n1;
       this.n2=n2;
       this.value=value;
       
       if("R".equals(type_))
       {
           this.comp_id=count_res;
           count_res++;
           
       }
       
       if("V".equals(type_))
       {
           this.comp_id=count_volt;
           count_volt++;
       }
   }
   
   
   
   @Override
   public String toString()
   {
       return("" + this.type_ + "" + this.comp_id + " " + this.n1 + " " + this.n2 + " " + volt_type + " " + this.value);
   }
   
    
}
