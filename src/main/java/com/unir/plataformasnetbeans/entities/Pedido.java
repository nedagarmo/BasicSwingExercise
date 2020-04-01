/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unir.plataformasnetbeans.entities;

import com.unir.plataformasnetbeans.utils.StringsManager;

/**
 *
 * @author nedagarmo
 */
public class Pedido {

    private String nombre;
    private String tipo;
    private int cantidad;
    private String distribuidor;
    private boolean isSucursalPrincipal;
    private boolean isSucursalSecundaria;

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @return the distribuidor
     */
    public String getDistribuidor() {
        return distribuidor;
    }

    /**
     * @return the isSucursalPrincipal
     */
    public boolean isIsSucursalPrincipal() {
        return isSucursalPrincipal;
    }

    /**
     * @return the isSucursalSecundaria
     */
    public boolean isIsSucursalSecundaria() {
        return isSucursalSecundaria;
    }

    public String validar(String nombre, String tipo, String cantidad, String distribuidor,
            boolean isSucursalPrincipal, boolean isSucursalSecundaria) {
        String errores = "";

        if (nombre.trim().equals("") || !StringsManager.isAlphanumeric(nombre)) {
            errores += "- Se debe proporcionar un nombre de medicamento alfanumérico \n\r";
        }

        if (tipo.trim().equals("")) {
            errores += "- Debe elegir un tipo de medicamento \n\r";
        }

        try {
            this.cantidad = Integer.parseUnsignedInt(cantidad);
        } catch (NumberFormatException e) {
            errores += "- La cantidad debe ser un valor numérico positivo \n\r";
        }

        if (distribuidor.trim().equals("")) {
            errores += "- Debe elegir un distribuidor \n\r";
        }

        if (!isSucursalPrincipal && !isSucursalSecundaria) {
            errores += "- Debe elegir almenos una sucursal \n\r";
        }

        this.nombre = nombre;
        this.tipo = tipo;
        this.distribuidor = distribuidor;
        this.isSucursalPrincipal = isSucursalPrincipal;
        this.isSucursalSecundaria = isSucursalSecundaria;

        return errores.equals("") ? "success" : errores;
    }
}
