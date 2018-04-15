/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entrada;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class guia extends entrada{

    @Override
    public void preferencia() {
        Scanner as = new Scanner (System.in);
        System.out.println("Que desea como entrada? 1. Fruta 2. Sopa");
        c=as.nextInt();
        
    }

    @Override
    public void seleccion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
