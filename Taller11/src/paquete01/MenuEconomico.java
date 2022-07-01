/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

/**
 *
 * @author SALA I
 */
public class MenuEconomico extends Menu{
    private double pAdicional;
    
    public MenuEconomico(String nombrePlato, double vInicialPlato, double p){
    super(nombrePlato, vInicialPlato);
    pAdicional = p;
    }
    
    public void establecerPorcentaje(double p){
    pAdicional = vInicialPlato*(p/100);
    }

    @Override
    public void establecerValorPlato() {
        vPlato = vPlato + pAdicional;
    }
    
    public double obtenerPorcentaje(){
    return pAdicional;
    }
    @Override
    public String toString(){
    String cadena = String.format("%s\n", super.toString());
cadena = String.format("%s\nPorcentaje Adicional: %.2f\n",
            cadena,pAdicional);
    return cadena;
    }
}
