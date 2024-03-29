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
public class MenuEconomico extends Menu{
    double descuento;

    public MenuEconomico(double descuento, String nombrePlato, 
            double valorInicial) {
        super(nombrePlato, valorInicial);
        this.descuento = descuento;
    }

    @Override
    public void calcularValorMenu() {
        valorMenu = valorInicial - (valorInicial * (descuento/100));
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    
      public String toString() {
        String cadena = String.format("Menu Economico\n"
                + "\tPlato: %s\n"
                + "\tValor Inicial: %.2f\n"
                + "\tPorcentaje Descuento: %.2f\n"
                + "\tValor Menu: %.2f\n",
                nombrePlato,
                valorInicial,
                descuento,
                valorMenu);
        return cadena;
    }  
    
}
