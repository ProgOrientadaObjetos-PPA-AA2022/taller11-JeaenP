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

    public Cuenta(String nombreCliente, double IVA, ArrayList<Menu> listadoCartas, 
            double valorCancelar) {
        this.nombreCliente = nombreCliente;
        this.IVA = IVA;
        this.listadoCartas = listadoCartas;
        this.valorCancelar = valorCancelar;
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

    public void setValorCancelar(double valorCancelar) {
        this.valorCancelar = valorCancelar;
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
    
    
   
}
