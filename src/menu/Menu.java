/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;
import Entrada.*;
import bebida.*;
import postre.*;
import pp.*;

/**
 *
 * @author Estudiantes5
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        entrada en = new platos();
        en.seleccion();
        pp ab = new carnes();
        ab.seleccion();
        pp ens = new ensalada();
        ens.seleccion();
        pp le = new legumbre();
        le.seleccion();
        bebidas bb = new tipos();
        bb.seleccion();
        postre po= new todos ();
        po.seleccion();
        en.imprimir();
    }
}
