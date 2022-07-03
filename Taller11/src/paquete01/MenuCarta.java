/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

/**
 *
 * @author SALA I
 */
public class MenuCarta extends Menu{
    private double vPorcionGuarnicion;
    private double vBebida;
    private double pAdicional;
    
    public MenuCarta(String nombrePlato, double vInicialPlato, double vPg, double vB, double p){
    super(nombrePlato, vInicialPlato);
    vPorcionGuarnicion = vPg;
    vBebida = vB;
    pAdicional = p;
    }
    
    public void establecerValorPorcionGuarnicion(double vpg){
    vPorcionGuarnicion = vpg;
    }
    
    public void establecerValorBebida(double vb){
    vBebida = vb;
    }
    
    public void establecerPorcentaje(double p){
    pAdicional =  p;
    }

    @Override
    public void establecerValorPlato() {
        vPlato = vInicialPlato + vPorcionGuarnicion + vBebida;
        vPlato = vPlato + ((pAdicional * vPlato)/100);
    }
    public double obtenerValorPorcionGuarnicion(){
    return vPorcionGuarnicion;
    }
    
    public double obtenerValorBebida(){
    return vBebida;
    }
    
    public double obtenerPorcentaje(){
    return pAdicional;
    }
    @Override
    public String toString(){
    String cadena = String.format("Menu a la Carta:\n%s", super.toString());
    cadena = String.format("%s"
            + "\tValor Porcion Guarnicion: %.2f\n"
            + "\tValor bebida: %.2f\n"
            + "\tPorcentaje Adicional: %.2f\n"
            + "\tValor del Plato: %.2f\n",
            cadena, vPorcionGuarnicion, vBebida, pAdicional, obtenerValorPlato());
    return cadena;
    }
}
