/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication28;

import java.util.ArrayList;

/**
 *
 * @author Antonio
 */
public class JavaApplication28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] coleccion = miSplit("frase de prueba", " ");
        for (String s:coleccion){
            System.out.println(s);
        }
    }

    public static String[] miSplit(String cadena, String separador) {
        ArrayList<StringBuilder> listaPalabras = new ArrayList<>();
        StringBuilder palabraEnCurso = new StringBuilder();
        for (int i = 0; i < cadena.length(); i++) {

            if (cadena.charAt(i) == separador.charAt(0)) {

                if (!palabraEnCurso.toString().equals("")) {
                    listaPalabras.add(palabraEnCurso);
                }
                palabraEnCurso = new StringBuilder();
            } else {
                palabraEnCurso.append(cadena.charAt(i));
            }

        }
        if (!palabraEnCurso.toString().equals("")) {
            listaPalabras.add(palabraEnCurso);
        }
        String[] miArray= new String[listaPalabras.size()];
        for(int i=0;i<listaPalabras.size();i++){
            StringBuilder sb = listaPalabras.get(i);
            miArray[i]=sb.toString();
        }
        return miArray;
    }

}
