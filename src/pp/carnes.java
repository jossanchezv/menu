/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp;

import javax.swing.JOptionPane;

/**
 *
 * @author Estudiantes
 */
public  class carnes extends pp {
        @Override
    public void seleccion() {
        JOptionPane.showMessageDialog(null, "El plato principal trae inicialmente arroz y papas a la francesa.");
        int op= Integer.parseInt(JOptionPane.showInputDialog("que carne desea? \n 1.Res \n 2.Cerdo \n 3.Pollo"));
        switch (op){
            case 1:
                sel= "Res";
            case 2:
                sel= "Cerdo";
            case 3:
                sel= "Pollo";       
        }
    }
}
