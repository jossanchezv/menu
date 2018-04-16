/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package postre;

import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class todos extends postre {
    @Override
    public void seleccion(){
        int op= Integer.parseInt(JOptionPane.showInputDialog("Que postre desea? \n 1.Gelatina \n 2.Flan \n 3.Ponque tres leches" ));
        switch (op){
            case 1:{
                sel= "Gelatina";
            }
            case 2:{
                sel= "Flan";
            }
            case 3:{
                sel= "Ponque tres leches";
            }
        }
    }
}
