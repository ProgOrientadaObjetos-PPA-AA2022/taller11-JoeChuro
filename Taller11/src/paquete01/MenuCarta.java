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
    pAdicional =  vInicialPlato*(p/100);
    }

    @Override
    public void establecerValorPlato() {
        vPlato = vPlato + vPorcionGuarnicion + vBebida + pAdicional;
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
    String cadena = String.format("%s\n", super.toString());
    cadena = String.format("%sValor Porcion Guarnicion: %.2f\n"
            + "Valor bebida: %.2f\n"
            + "Porcentaje Adicional: %.2f\n"
            + "Valor del Plato: %.2f",
            cadena, vPorcionGuarnicion, vBebida, pAdicional, obtenerValorPlato());
    return cadena;
    }
}
