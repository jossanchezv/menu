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
public class platos extends entrada {
Scanner as = new Scanner(System.in);
   
    @Override
    public void seleccion() {
        System.out.println("Como entrada tenemos Fruta o Sopa; que le gustaria? 1. Fruta 2. Sopa");
        preferencia = as.nextInt();
        if (preferencia == 1) {
            int op = 0;
            int anadir;
            Scanner sc = new Scanner(System.in);
            Scanner dd = new Scanner(System.in);
            System.out.println("La fruta se compone de: Papaya, fresa y melón, desea agregar algo más?");
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
        if (preferencia == 2) {
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
}
