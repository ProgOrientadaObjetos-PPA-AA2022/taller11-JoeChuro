/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

/**
 *
 * @author SALA I
 */
public abstract class Menu {
    
    protected String nPlato;
    protected double vInicialPlato;
    protected double vPlato;
    
    public Menu(String n, double vip){
    nPlato = n;
    vInicialPlato = vip;   
    }
    
    public void establecerNombrePlato(String m){
    nPlato = m;
    }
    
    public void establecerValorInicialPlato(double m){
    vInicialPlato = m;
    }
    
    public abstract void establecerValorPlato();
    
    
    public String obtenerNombrePlato(){
    return nPlato;
    }
    
    public double obtenerValorInicialPlato(){
    return vInicialPlato;
    }
    
    public double obtenerValorPlato(){
    return vPlato;
    }
    
    @Override
    public String toString(){
    String cadena = String.format("Nombre del Plato: %s\n"
            + "Valor inicial del Plato: %.2f\n",
            nPlato, vInicialPlato);
    return cadena;
    }
}
