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
public class bebidascalientes extends bebidas{

    @Override
    public void seleccion() {
        int op;
        Scanner sc = new Scanner(System.in);
        System.out.println("Que bebida desea? /n 1. Tinto /n 2. Cafe /n 3. Agua aromatica" );
  
        op = sc.nextInt();
        switch (op){
            case 1:
                sel= "Tinto";
            case 2:
                sel= "cafe";
            case 3:
                sel= "Agua aromatica";       
        }
    }

    
}
