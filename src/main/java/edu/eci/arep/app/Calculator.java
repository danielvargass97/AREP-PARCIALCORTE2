/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arep.app;


/**
 *
 * @author Daniel
 */
public class Calculator {
    
    public Double calculateLOG(Double var){
        return Math.log(var);
    }
    
    public Double calculateATAN(Double var){
        return Math.atan(var);
    }
    
    public String calculateLOGJSON(Double var){
        String result = "{" +
                "Operation: LOG"+
                ", Input:"+var+
                ", Output:"+calculateLOG(var)+"}";
        return result;
    }
    
    public String calculateATANJSON(Double var){
        String result = "{" +
                "Operation: ATAN"+
                ", Input:"+var+
                ", Output:"+calculateATAN(var)+"}";
        return result;
    }
    
}
