/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

import paquete02.Menu;

/**
 *
 * @author SALA I
 */
public class MenuDelDia extends Menu {
    double valorPostre;
    double valorBebida;

    public MenuDelDia(double valorPostre, double valorBebida, 
            String nombrePlato, double valorInicial) {
        super(nombrePlato, valorInicial);
        this.valorPostre = valorPostre;
        this.valorBebida = valorBebida;
    }
    
    
    public void calcularValorMenu() {
        valorMenu = valorInicial + valorPostre + valorBebida;
    }

    public void setValorPostre(double valorPostre) {
        this.valorPostre = valorPostre;
    }

    public void setValorBebida(double valorBebida) {
        this.valorBebida = valorBebida;
    }

    public double getValorPostre() {
        return valorPostre;
    }

    public double getValorBebida() {
        return valorBebida;
    }
    
    public String toString() {
        String cadena = String.format("Menu del Dia\n"
                + "\tPlato: %s\n"
                + "\tValor Inicial: %.2f\n"
                + "\tValor Bebida: %.2f\n"
                + "\tValor Postre: %.2f\n"
                + "\tValor Menu: %.2f\n",
                nombrePlato,
                valorInicial,
                valorBebida,
                valorPostre,
                valorMenu);
        return cadena;
    }  
    
    
}
