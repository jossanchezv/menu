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
public class fruta extends entrada {

    @Override
    public void seleccion() {
        if (c == 1) {
            int op = 0;
            int anadir;
            Scanner sc = new Scanner(System.in);
            Scanner dd = new Scanner(System.in);
            System.out.println("La fruta se compone de: Papaya, fresa y melón, desea agregar algo más/n ");
            System.out.println("1. Si 2. No");
            anadir = dd.nextInt();
            if (anadir == 1) {
                System.out.println("Que otro ingrediente desea?");
                System.out.println("1. Uvas 2. Cerezas 3. Banano");
                op = sc.nextInt();
                        
                switch (op) {
                    case 1:
                        sel = "uvas";
                    case 2:
                        sel = "cerezas";
                    case 3:
                        sel = "banano";
                    default:
                        sel = "No ha seleccionado nada";
                }
            }
        }

    }

    @Override
    public void preferencia() {
        
    }
}
