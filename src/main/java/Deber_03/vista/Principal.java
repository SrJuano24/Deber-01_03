/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deber_03.vista;

import Deber_03.controlador.ClienteControl;
import Deber_03.controlador.FacturaControl;
import Deber_03.modelo.Cliente;

/**
 *
 * @author Juano
 */
public class Principal {

    public static void main(String[] args) {
        var facturaControl = new FacturaControl();
        var data = new String[7];
        data[0] = "01";
        data[1] = "AMAZON";
        data[2] = "0102453949001";
        data[3] = "Pio Bravo";
        data[4] = "4112349";
        data[5] = "20";
        data[6] = "25.8";
        System.out.println(facturaControl.crear(data));
        System.out.println("-------------------------------");

        var clienteControl = new ClienteControl();
        var data1 = new String[6];
        data1[0] = "01";
        data1[1] = "04";
        data1[2] = "Pedro Ramirez";
        data1[3] = "0302456980";
        data1[4] = "Calle Larga";
        data1[5] = "09908723478";

        System.out.println(clienteControl.crear(data1));

    }

}
