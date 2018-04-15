/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entrada;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class sopa extends entrada {

    @Override
    public void seleccion() {
        if (c == 2) {
            int op;
            Scanner sc = new Scanner(System.in);
            System.out.println("Que sopa desea? 1.Ajiaco  2.Cerdo  3.Pollo");

            op = sc.nextInt();
            switch (op) {
                case 1:
                    sel = "Res";
                case 2:
                    sel = "Cerdo";
                case 3:
                    sel = "Pollo";
            }
        }

    }

    @Override
    public void preferencia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
