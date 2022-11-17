/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deber_03.servicio;

import Deber_03.modelo.Factura;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Juano
 */
public class FacturaServiceImpl implements FacturaService {

    private List<Factura> facturaList;

    public FacturaServiceImpl() {
        this.facturaList = new ArrayList<>();
    }

    @Override
    public void crear(Factura factura) {
        this.facturaList.add(factura);
    }

    @Override
    public void modificar(int numeroFactura, Factura facturaModificada) {

        var indice = 0;
        for (var factura : this.facturaList) {
            if (factura.getNumeroFactura() == numeroFactura) {
                this.facturaList.set(indice, facturaModificada);
                break;
            } else {
                indice++;
            }
        }

    }

    @Override
    public void eliminar(int numeroFactura) {
        var indice = 0;
        for (var factura : this.facturaList) {
            if (factura.getNumeroFactura() == numeroFactura) {
                this.facturaList.remove(indice);
                break;
            } else {
                indice++;
            }
        }
    }

    @Override

    public List<Factura> listar() {
        return this.facturaList;
    }

}
