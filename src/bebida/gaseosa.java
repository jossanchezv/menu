/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bebida;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class gaseosa extends bebidas {

    @Override
    public void seleccion() {
        Scanner l = new Scanner(System.in);
        int a;
        a = l.nextInt();
        if (a == 2) {
            int op;
            Scanner sc = new Scanner(System.in);
            System.out.println("Que gaseosa desea? 1.Coca cola  2.Pepsi  3.Quatro 4.Colombiana");

            op = sc.nextInt();
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
    }

}
