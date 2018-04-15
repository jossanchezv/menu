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
public class licores extends bebidas {

    @Override
    public void seleccion() {
        Scanner l = new Scanner(System.in);
        int a;
        a=l.nextInt();
        if (a==4){
            int op;
            Scanner sc = new Scanner(System.in);
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
