/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unir.plataformasnetbeans.utils;

import java.util.regex.Pattern;

/**
 *
 * @author nedagarmo
 */
public class StringsManager {
    public static boolean isAlphanumeric(String value)
    {
        return Pattern.matches("^[a-zA-Z0-9 ñáéíóúÁÉÍÓÚüÜÑ]*$", value);
    }
}
