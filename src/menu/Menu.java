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
 * @author Estudiantes
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        entrada gu = new guia();
        gu.preferencia();
        entrada en = new fruta();

        en.seleccion();
        entrada so = new sopa();

        so.seleccion();
        pp ab = new carnes();
        ab.seleccion();
        bebidas bb = new bebidascalientes();
        bb.seleccion();
    }
}
