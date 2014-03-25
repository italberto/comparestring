/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ital.time;

import java.util.Date;

/**
 *
 * @author italberto
 */
public class TimeUtil {

    public static Double getTimeNow() {
        Date data = new Date();

        return new Double(data.getTime());
    }

    public static Double getTimeNow(Integer divisor) {
        if (divisor != null && divisor != 0) {
            return getTimeNow() % divisor;
        } else {
            return getTimeNow();
        }
    }
}
