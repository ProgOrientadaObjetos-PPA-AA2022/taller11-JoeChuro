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
    private int pAdicional;
    
    public MenuCarta(String nombrePlato, double vInicialPlato, double vPg, double vB, int p){
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
    
    public void establecerPorcentaje(int p){
    pAdicional = p;
    }

    @Override
    public void establecerValorPlato() {
        vPlato = vInicialPlato + vPorcionGuarnicion + vBebida / pAdicional;
    }
    public double obtenerValorPorcionGuarnicion(){
    return vPorcionGuarnicion;
    }
    
    public double obtenerValorBebida(){
    return vBebida;
    }
    
    public int obtenerPorcentaje(){
    return pAdicional;
    }
    public String toString(){
    String cadena = String.format("%s\n", super.toString());
    cadena = String.format("%sValor Porcion Guarnicion: %.2f\n"
            + "Valor bebida: %.2f\n"
            + "Porcentaje Adicional: %d",
            cadena, vPorcionGuarnicion, vBebida, pAdicional);
    return cadena;
    }
}
