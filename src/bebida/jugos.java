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
public class jugos extends bebidas {

    @Override
    public void seleccion() {
        Scanner l = new Scanner(System.in);
        int a;
        a = l.nextInt();
        if (a == 3) {
            int op;
            Scanner sc = new Scanner(System.in);
            System.out.println("Que jugo desea? 1.Mora  2.Fresa  3.Lulo 4. Maracuya");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    sel = "Mora";
                case 2:
                    sel = "Fresa";
                case 3:
                    sel = "Lulo";
                case 4:
                    sel = "Maracuya";
            }
        }

    }
}
