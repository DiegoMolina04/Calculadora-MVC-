/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modelo;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class modelo {
    
    private double numero1 =0.0;
    private double numero2 =0.0;
    
    private NumberFormat df = new DecimalFormat("#0.00");

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    
    public String suma (){
        return df.format(this.numero1 + this.numero2);
        
    }
    
     public String resta (){
        return df.format(this.numero1 - this.numero2);
        
    }
     
      public String multiplicacion (){
        return df.format(this.numero1 * this.numero2);
        
    }
      
       public String division (){
        return df.format(this.numero1 / this.numero2);
        
    }
     
}
