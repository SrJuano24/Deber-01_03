/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deber_03.controlador;

import Deber_03.modelo.Factura;
import Deber_03.servicio.FacturaServiceImpl;

/**
 *
 * @author Juano
 */
public class FacturaControl {

    private FacturaServiceImpl facturaServiceImpl;

    public FacturaControl() {
        this.facturaServiceImpl = new FacturaServiceImpl();
    }

    public String crear(String[] data) {
        var retorno = "No se pudo crear la factura:";
        var numeroFactura = Integer.valueOf(data[0]).intValue();
        var nombreEmpresa = data[1];
        var RUCEmisor = data[2];
        var direccion = data[3];
        var telefono = Integer.valueOf(data[4]).intValue();;
        var cantidadProducto = Integer.valueOf(data[5]).intValue();;
        var costoProducto = Double.valueOf(data[6]).doubleValue();

        if (numeroFactura < 1) {
            retorno += " Numero de factura incorrectos.";

        } else {
            if (cantidadProducto < 0 || costoProducto < 0) {
                retorno += " La cantidad de productos o su costo son incorrectos.";
            } else {
                var factura = new Factura(numeroFactura, nombreEmpresa, RUCEmisor,
                        direccion, telefono, cantidadProducto, costoProducto);
                this.facturaServiceImpl.crear(factura);
                retorno = "Factura NUM." + factura.getNumeroFactura()
                        + " creada correctamente.";
            }
        }
        return retorno;
    }

}
