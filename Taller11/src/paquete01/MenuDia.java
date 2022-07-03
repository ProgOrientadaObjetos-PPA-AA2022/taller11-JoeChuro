/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

/**
 *
 * @author SALA I
 */
public class MenuDia extends Menu{
    private double vPostre;
    private double vBebida;
    
    public MenuDia(String nombrePlato, double vInicialPlato, double vP, double vB){
    super(nombrePlato, vInicialPlato);
    vPostre = vP;
    vBebida = vB;
    }
    
    public void establecerValorPostre(double vp){
    vPostre = vp;
    }
    
    public void establecerValorBebida(double vb){
    vBebida = vb;
    }
    


    @Override
    public void establecerValorPlato() {
        vPlato = vInicialPlato + vPostre + vBebida;
    }
    public double obtenerValorPorcionGuarnicion(){
    return vPostre;
    }
    
    public double obtenerValorBebida(){
    return vBebida;
    }
    
    @Override
    public String toString(){
    String cadena = String.format("Menu del Dia:\n%s", super.toString());
    cadena = String.format("%s"
            + "\tValor Postre: %.2f\n"
            + "\tValor bebida: %.2f\n"
            + "\tValor Plato: %.2f\n",
            cadena, vPostre, vBebida, obtenerValorPlato());
    return cadena;
    }
}
