/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;
import java.util.ArrayList;
import paquete02.*;
import paquete03.*;
import paquete04.*;

/**
 *
 * @author reroes
 */
public class Ejecutor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Menu> menus = new ArrayList<>();
        MenuNinos n1 = new MenuNinos(1, 1.5, "Niños 01", 2);
        MenuNinos n2 = new MenuNinos(1, 1.5, "Niños 02", 3 );
        MenuEconomico e = new MenuEconomico(25, "Econo 001", 4);
        MenuDelDia d = new MenuDelDia(1, 1, "Dia 001", 5);
        MenuALaCarta c = new MenuALaCarta(1.5, 2, 10, "Carta 001", 6);
        n1.calcularValorMenu();
        n2.calcularValorMenu();
        e.calcularValorMenu();
        d.calcularValorMenu();
        c.calcularValorMenu();
        menus.add(n1);
        menus.add(n2);
        menus.add(e);
        menus.add(d);
        menus.add(c);
        Cuenta cuenta = new Cuenta("René Elizalde", 10, menus);
        cuenta.calcularValorCancelar();
        System.out.println(cuenta);
    }
    
    
}
// lo que debe presentar
/*
Factura
Cliente: René Elizalde
Menu de niños:
	Plato: Niños 01
	Valor Inicial: 2,00
	Valor helado: 1,00
	Valor pastel: 1,50
	Valor del Menú: 4,50

Menu de niños:
	Plato: Niños 02
	Valor Inicial: 3,00
	Valor helado: 1,00
	Valor pastel: 1,50
	Valor del Menú: 5,50

Menu Económico:
	Plato: Econo 001
	Valor Inicial: 4,00
	Porcentaje Descuento: 25,00
	Valor del Menú: 3,00

Menu del Día:
	Plato: Dia 001
	Valor Inicial: 5,00
	Valor bebida: 1,00
	Valor postre: 1,00
	Valor del Menú: 7,00

Menu a la Carta:
	Plato: Carta 001
	Valor Inicial: 6.0
	Valor guarnición: 1.5
	Valor bebida: 2.0
	Porcentaje Adicional: 10,00
	Valor del Menú: 10,10

Subtotal: 30,1
IVA: 10,0%
Total a pagar: 33,110

*/