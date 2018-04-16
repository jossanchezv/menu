/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entrada;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Estudiantes
 */
public class platos extends entrada {
Scanner as = new Scanner(System.in);
   
    @Override
    public void seleccion() {

        preferencia = Integer.parseInt(JOptionPane.showInputDialog("Como entrada tenemos Fruta o Sopa; que le gustaria? \n 1. Fruta \n 2. Sopa"));
        if (preferencia == 1) {
            

            int anadir =  Integer.parseInt(JOptionPane.showInputDialog("La fruta se compone de: Papaya, fresa y melón, desea agregar algo más? \n 1. Si \n 2. No "  ));

            int op = 0;
            if (anadir == 1) {
                op =  Integer.parseInt(JOptionPane.showInputDialog("Que otro ingrediente desea \n 1. Uvas \n2. Cerezas \n3. Banano" ));
                switch (op) {
                    case 1:{
                        sel = "uvas";
                    }
                    case 2:
                        sel = "cerezas";
                    case 3:
                        sel = "banano";
                    default:
                        sel= "No ha seleccionado nada";
                }            
            }
        }
        if (preferencia == 2) {
            int op;
            op =   Integer.parseInt(JOptionPane.showInputDialog("Que sopa desea? \n 1.Ajiaco \n 2.Arroz \n 3Colisero"));
            switch (op) {
                case 1:
                    sel = "Ajiaco";
                case 2:
                    sel = "Arroz";
                case 3:
                    sel = "Colisero";
                default:
                    sel = "no ha seeccionado nada";
            }
        }
    }

    @Override
    public void imprimir() {
        JOptionPane.showMessageDialog(null, sel);
    }


}
