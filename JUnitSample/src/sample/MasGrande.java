/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

/**
 * @author: Sebastian Fernandez Devolver el elemento más grande de un Array
 * @param a array de int
 * @return elemento más grande de a
 */
public class MasGrande {

    public static int max(int[] a) {
        int i, m = 0;

        if (a == null) {
            return 0;
        } else {
            if(a.length == 0){
                return 0;
            }
            m = a[0];
        }
        for (i = 0; i < a.length; i++) {
                if (a[i] > m) {
                    m = a[i];
                }
            }

        return m;
    }
}
