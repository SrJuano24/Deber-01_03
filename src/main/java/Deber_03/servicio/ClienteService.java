/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Deber_03.servicio;

import Deber_03.modelo.Cliente;
import java.util.List;

/**
 *
 * @author Juano
 */
public interface ClienteService {
    
    public abstract void crear(Cliente cliente);

    public abstract void modificar(int codigoCliente, Cliente clienteModificado);

    public abstract void eliminar(int codigoCliete);

    public abstract List<Cliente> listar();
    
}
