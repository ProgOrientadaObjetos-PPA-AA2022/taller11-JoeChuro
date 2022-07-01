/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.ArrayList;

/**
 *
 * @author SALA I
 */
public class Cuenta {
    private String nombreCliente;
    private double iva;
    private double vPagar;
    ArrayList<Menu> menuSolicitado = new ArrayList<>();
    
    public Cuenta(String n, double i, double v, ArrayList<Menu> m){
    nombreCliente = n;
    iva = i;
    vPagar = v;
    menuSolicitado = m;
    }
    public void establecerNombre(String n){
    nombreCliente = n;
    }
    public void establecerIva(double i){
    iva = i;
    }
    public void establecerMenus(ArrayList<Menu> m){
    menuSolicitado = m;
    }
    
}
