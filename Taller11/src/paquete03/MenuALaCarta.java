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
public class MenuALaCarta extends Menu {
    double valorPorcionGuarnicion;
    double valorBebida;
    double porcentajeAdicional;

    public MenuALaCarta(double valorPorcionGuarnicion, double valorBebida,
            double porcentajeAdicional, String nombrePlato, double valorInicial) {
        super(nombrePlato, valorInicial);
        this.valorPorcionGuarnicion = valorPorcionGuarnicion;
        this.valorBebida = valorBebida;
        this.porcentajeAdicional = porcentajeAdicional;
    }
    
    
    public void calcularValorMenu() {
        valorMenu = (valorInicial + valorPorcionGuarnicion + valorBebida) +
                (valorInicial *(porcentajeAdicional/100));
    }

    public void setValorPorcionGuarnicion(double valorPorcionGuarnicion) {
        this.valorPorcionGuarnicion = valorPorcionGuarnicion;
    }

    public void setValorBebida(double valorBebida) {
        this.valorBebida = valorBebida;
    }

    public void setPorcentajeAdicional(double porcentajeAdicional) {
        this.porcentajeAdicional = porcentajeAdicional;
    }

    public double getValorPorcionGuarnicion() {
        return valorPorcionGuarnicion;
    }

    public double getValorBebida() {
        return valorBebida;
    }

    public double getPorcentajeAdicional() {
        return porcentajeAdicional;
    }
    
    public String toString() {
        String cadena = String.format("Menu a la Carta\n"
                + "\tPlato: %s\n"
                + "\tValor Inicial: %.2f\n"
                + "\tValor Guarnicion: %.2f\n"
                + "\tValor Bebida: %.2f\n"
                + "\tPorcentaje Adicional: %.2f\n"
                + "\tValor Menu: %.2f\n",
                nombrePlato,
                valorInicial,
                valorPorcionGuarnicion,
                valorBebida,
                porcentajeAdicional,
                valorMenu);
        return cadena;
    }  
}
