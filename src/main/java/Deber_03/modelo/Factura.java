/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deber_03.modelo;

/**
 *
 * @author Juano
 */
public class Factura {

    private int numeroFactura;
    private String nombreEmpresa;
    private String RUCEmisor;
    private String direccion;
    private int telefono;
    private int cantidadProducto;
    private double costoProducto;

    public Factura(int numeroFactura, String nombreEmpresa, String RUCEmisor, String direccion, int telefono, int cantidadProducto, double costoProducto) {
        this.numeroFactura = numeroFactura;
        this.nombreEmpresa = nombreEmpresa;
        this.RUCEmisor = RUCEmisor;
        this.direccion = direccion;
        this.telefono = telefono;
        this.cantidadProducto = cantidadProducto;
        this.costoProducto = costoProducto;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public String getRUCEmisor() {
        return RUCEmisor;
    }

    public void setRUCEmisor(String RUCEmisor) {
        this.RUCEmisor = RUCEmisor;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public double getCostoProducto() {
        return costoProducto;
    }

    public void setCostoProducto(double costoProducto) {
        this.costoProducto = costoProducto;
    }

    public void setCostoProducto(int costoProducto) {
        this.costoProducto = costoProducto;
    }

    private String RUCValido() {
        var retorno = "";
        var longitud = this.RUCEmisor.length();
        if (longitud == 13) {
            retorno = "Ruc Valido";

        } else {
            retorno = "Ruc Invalido";
        }
        return retorno;
    }

    private int CalcularTotal() {
        var retorno = 0;
        var subtotal = this.cantidadProducto * this.costoProducto;
        var total = subtotal * 0.12 + subtotal;
        return retorno;
    }

    @Override
    public String toString() {
        return "Factura{" + "numeroFactura=" + numeroFactura + ", nombreEmpresa="
                + nombreEmpresa + ", RUCEmisor=" + RUCEmisor
                + " el RUC utilizado es un: " + this.RUCValido() + ", direccion="
                + direccion + ", telefono=" + telefono + ", cantidadProducto="
                + cantidadProducto + ", costoProducto=" + costoProducto
                + ", el valor total a pagr es de: " + this.CalcularTotal() + '}';
    }
}
