/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class ensalada extends pp {
        @Override
    public void seleccion() {
        int op;
        Scanner sc = new Scanner(System.in);
        System.out.println("Que ensalada desea?  1. Frutas  2. Verduras " );
  
        op = sc.nextInt();
        switch (op){
            case 1:
                sel= "Frutas";
            case 2:
                sel= "Verduras";    
        }
    }

}
