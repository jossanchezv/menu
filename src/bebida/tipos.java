/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bebida;

import javax.swing.JOptionPane;

/**
 *
 * @author Estudiantes
 */
public class tipos extends bebidas {

    @Override
    public void seleccion() {
        int a= Integer.parseInt(JOptionPane.showInputDialog("Que le gustaria beber? \n 1. Bebida caliente \n 2. Gaseosa \n 3. Jugo \n 4. Licor"));
        if (a == 1) {
            int op= Integer.parseInt(JOptionPane.showInputDialog("Que bebida desea? \n 1. Tinto \n 2. Cafe \n 3. Agua aromatica"));
            switch (op) {
                case 1:
                    sel = "Tinto";
                case 2:
                    sel = "cafe";
                case 3:
                    sel = "Agua aromatica";
            }
        }
        if (a == 2) {
            int op= Integer.parseInt(JOptionPane.showInputDialog("Que gaseosa desea? \n 1.Coca cola \n 2.Pepsi \n 3.Quatro \n 4.Colombiana"));
            switch (op) {
                case 1:
                    sel = "Coca cola";
                case 2:
                    sel = "Pepsi";
                case 3:
                    sel = "Quatro";
                case 4:
                    sel = "Colombiana";
                default:
                    sel = "No ha seleccionado nada";
            }
        }
        if (a == 3) {
            int op= Integer.parseInt(JOptionPane.showInputDialog("Que jugo desea? \n 1. Fresa \n 2. Mora \n 3. Maracuya"));
            switch (op) {
                case 1:
                    sel = "Fresa";
                case 2:
                    sel = "Mora";
                case 3:
                    sel = "Maracuya";
            }
        }
        if (a == 4) {
            int op= Integer.parseInt(JOptionPane.showInputDialog("Que licor desea? \n 1.Vino \n 2.Whiskey \n 3.Ginebra \n 4.Ron \n 5 .Vodka"));
            switch (op) {
                case 1:
                    sel = "Vino";
                case 2:
                    sel = "Whiskey";
                case 3:
                    sel = "Ginebra";
                case 4:
                    sel = "Ron ";
                case 5:
                    sel = "Vodka ";
            }
        }
    }
}