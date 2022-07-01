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
public class MenuNinos extends Menu {
    double valorPorcionHelado;
    double valorPorcionPastel;

    public MenuNinos(double valorPorcionHelado, double valorPorcionPastel, 
            String nombrePlato, double valorInicial) {
        super(nombrePlato, valorInicial);
        this.valorPorcionHelado = valorPorcionHelado;
        this.valorPorcionPastel = valorPorcionPastel;
    }
    
    public void calcularValorMenu() {
        valorMenu = valorInicial + valorPorcionHelado + valorPorcionPastel;
    }
    public void setValorPorcionHelado(double valorPorcionHelado) {
        this.valorPorcionHelado = valorPorcionHelado;
    }

    public void setValorPorcionPastel(double valorPorcionPastel) {
        this.valorPorcionPastel = valorPorcionPastel;
    }

    public double getValorPorcionHelado() {
        return valorPorcionHelado;
    }

    public double getValorPorcionPastel() {
        return valorPorcionPastel;
    }
    
    public String toString() {
        String cadena = String.format("Menu de Niños\n"
                + "\tPlato: %s\n"
                + "\tValor Inicial: %.2f\n"
                + "\tValor Helado: %.2f\n"
                + "\tValor Pastel: %.2f\n"
                + "\tValor Menu: %.2f\n",
                nombrePlato,
                valorInicial,
                valorPorcionHelado,
                valorPorcionPastel,
                valorMenu);
        return cadena;
    }
}
