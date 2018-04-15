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
public class tipos extends bebidas {

    @Override
    public void seleccion() {
        Scanner sc = new Scanner(System.in);
        int op;
        System.out.println("Que le gustaria beber? 1. Bebida caliente 2. Gaseosa 3. Jugo 4. Licor");
        a = sc.nextInt();
        if (a == 1) {
            System.out.println("Que bebida desea? 1. Tinto 2. Cafe 3. Agua aromatica");
            op = sc.nextInt();
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
        if (a == 3) {
            System.out.println("Que jugo desea? 1. Fresa 2. Mora 3. Maracuya");
            op = sc.nextInt();
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
            System.out.println("Que licor desea?  1.Vino  2.Whiskey  3.Ginebra  4.Ron 5 .Vodka");
            op = sc.nextInt();
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

