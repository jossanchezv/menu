/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class legumbre extends pp {

    @Override
    public void seleccion() {
        int op;
        Scanner sc = new Scanner(System.in);
        System.out.println("Que  desea para acompañar? 1.lenteja  2.arveja  3.ahuyama");
        op = sc.nextInt();
        switch (op) {
            case 1:
                sel = "lenteja";
            case 2:
                sel = "arveja";
            case 3:
                sel = "ahuyama";
        }
    }

}
