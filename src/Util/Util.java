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
    public static String cArrayToString(char[] array){
        String ret = "";
        for(int i = 0; i<array.length; i++)
            ret += array[i];
        return ret;
    }
}
