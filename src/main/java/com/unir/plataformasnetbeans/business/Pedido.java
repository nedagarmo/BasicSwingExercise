/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unir.plataformasnetbeans.business;

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
        String resultado = "success";

        this.nombre = nombre;
        this.tipo = tipo;

        try {
            this.cantidad = Integer.parseInt(cantidad);
        } catch (Exception e) {
            return "La cantidad debe ser un valor numérico";
        }

        this.distribuidor = distribuidor;
        this.isSucursalPrincipal = isSucursalPrincipal;
        this.isSucursalSecundaria = isSucursalSecundaria;

        return resultado;
    }
}
