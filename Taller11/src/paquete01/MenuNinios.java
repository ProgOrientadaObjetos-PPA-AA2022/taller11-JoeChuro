/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

/**
 *
 * @author SALA I
 */
public class MenuNinios extends Menu{
private double vPHelado;
    private double vPPastel;
    
    public MenuNinios(String nombrePlato, double vInicialPlato, double vPH, double vPP){
    super(nombrePlato, vInicialPlato);
    vPHelado = vPH;
    vPPastel = vPP;
    }
    
    public void establecerValorPorcionHelado(double vph){
    vPHelado = vph;
    }
    
    public void establecerValorPorcionPastel(double vpp){
    vPHelado = vpp;
    }

    @Override
    public void establecerValorPlato() {
        vPlato = vInicialPlato + vPHelado + vPPastel;
    }
    public double obtenerValorPorcionHelado(){
    return vPHelado;
    }
    
    public double obtenerValorPorcionPastel(){
    return vPPastel;
    }
    
    @Override
    public String toString(){
    String cadena = String.format("Menu Ninios:\n%s", super.toString());
    cadena = String.format("%s"
            + "\tValor porcion Helado: %.2f\n"
            + "\tValor porcion Pastel: %.2f\n"
            + "\tValor Plato: %.2f\n",
            cadena, vPHelado, vPPastel, obtenerValorPlato());
    return cadena;
    }    
}
