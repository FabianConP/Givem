/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

/**
 *
 * @author fabianconpnb
 */
public class Util {

    public static String cArrayToString(char[] array) {
        String ret = "";
        for (int i = 0; i < array.length; i++) {
            ret += array[i];
        }
        return ret;
    }

    public static String formatMoney(String text) {
        return text.substring(1).replace(".", "").replace(",", ".");
    }

    /**
     * Función que verifica si sólo hay numeros
     *
     * @param pat String para ser verificado
     * @return True si son sólo numeros, false en otro caso
     */
    public static boolean isOnlyNum(String pat) {
        if (pat.length() == 0) {
            return false;
        }
        for (int i = 0; i < pat.length(); i++) {
            if (!Character.isDigit(pat.charAt(i)) && pat.charAt(i)!='.') {
                return false;
            }
        }
        return true;
    }
    
    /**
     * Función que verifica si sólo hay letras
     *
     * @param pat String para ser verificado
     * @return True si son sólo numeros, false en otro caso
     */
    public static boolean isOnlyLet(String pat) {
        if (pat.length() == 0) {
            return false;
        }
        for (int i = 0; i < pat.length(); i++) {
            if (!Character.isAlphabetic(pat.charAt(i)) && pat.charAt(i)!=' ') {
                return false;
            }
        }
        return true;
    }

    /**
     * Función que verifica si sólo hay numeros y letras
     *
     * @param pat String para ser verificado
     * @return True si son sólo numeros y letras, false en otro caso
     */
    public static boolean isOnlyNL(String pat) {
        if (pat.length() == 0) {
            return false;
        }
        for (int i = 0; i < pat.length(); i++) {
            if (!Character.isDigit(pat.charAt(i)) && !Character.isAlphabetic(pat.charAt(i))) {
                return false;
            }
        }
        return true;
    }

}
