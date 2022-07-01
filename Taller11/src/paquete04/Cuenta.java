/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

import java.util.ArrayList;
import paquete02.Menu;

/**
 *
 * @author SALA I
 */
public class Cuenta {
    private String nombreCliente;
    private double IVA;
    private ArrayList<Menu> listadoCartas;
    private double valorCancelar;

        public Cuenta(String nombreCliente, double IVA, ArrayList<Menu> listadoCartas) {
        this.nombreCliente = nombreCliente;
        this.IVA = IVA;
        this.listadoCartas = listadoCartas;
        
    }

    
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setIVA(double IVA) {
        this.IVA = IVA;
    }

    public void setListadoCartas(ArrayList<Menu> listadoCartas) {
        this.listadoCartas = listadoCartas;
    }

    public void calcularValorCancelar() {
        for (int i = 0; i < listadoCartas.size(); i++) {
            valorCancelar = valorCancelar + listadoCartas.get(i).getValorMenu();
            
        }
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public double getIVA() {
        return IVA;
    }

    public ArrayList<Menu> getListadoCartas() {
        return listadoCartas;
    }

    public double getValorCancelar() {
        return valorCancelar;
    }
    
    public String toString() {
        String cadena = String.format("Factura\n"
                + "Cliente: %s\n", 
                nombreCliente);
        for (int i = 0; i < listadoCartas.size(); i++) {
            cadena = String.format("%s"
                    + "%s\n", cadena, listadoCartas.get(i));
        }
        
        cadena = String.format("%s"
                + "Subtotal: %.2f\n"
                + "IVA: %.2f%%\n"
                + "Total a pagar: %.3f", 
                cadena,
                valorCancelar,
                IVA,
                valorCancelar + (valorCancelar * (IVA/100)));
        return cadena;
    }
   
}
