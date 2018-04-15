/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package postre;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class todos extends postre {
    @Override
    public void seleccion(){
                int op;
        Scanner sc = new Scanner(System.in);
        System.out.println("Que postre desea? 1.Gelatina  2.Flan  3.Ponque tres leches" );
        op = sc.nextInt();
        switch (op){
            case 1:
                sel= "Gelatina";
            case 2:
                sel= "Flan";
            case 3:
                sel= "Ponque tres leches";       
        }
    }
}
