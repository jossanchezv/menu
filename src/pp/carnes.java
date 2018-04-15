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
public  class carnes extends pp {
        @Override
    public void seleccion() {
        int op;
        Scanner sc = new Scanner(System.in);
        System.out.println("Que carne desea? 1.Res  2.Cerdo  3.Pollo" );
  
        op = sc.nextInt();
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
