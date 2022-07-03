/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

/**
 *
 * @author SALA I
 */
public class MenuEconomico extends Menu {

    private double pDescuento;

    public MenuEconomico(String nombrePlato, double vInicialPlato, double p) {
        super(nombrePlato, vInicialPlato);
        pDescuento = p;
    }

    public void establecerPorcentaje(double p) {
        pDescuento = p;
    }

    @Override
    public void establecerValorPlato() {
        vPlato = vInicialPlato - (pDescuento * vInicialPlato) / 100;
    }

    public double obtenerPorcentaje() {
        return pDescuento;
    }

    @Override
    public String toString() {
        String cadena = String.format("Menu Economico:\n%s", super.toString());
        cadena = String.format("%s"
                + "\tPorcentaje Adicional: %.2f\n"
                + "\tValor del Plato: %.2f\n",
                cadena, pDescuento, obtenerValorPlato());
        return cadena;
    }
}
