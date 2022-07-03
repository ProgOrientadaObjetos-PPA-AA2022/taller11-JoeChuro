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
    private double subtotal;
    ArrayList<Menu> menuSolicitado = new ArrayList<>();
    
    public Cuenta(String n, double i, ArrayList<Menu> m){
    nombreCliente = n;
    iva = i;
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
    public void establecerValorPagar() {
        vPagar = subtotal + (subtotal * (iva / 100));
    }

    public void establecerSubtotal() {
        double subt = 0;
        for (int i = 0; i < menuSolicitado.size(); i++) {
            subt = subt + menuSolicitado.get(i).obtenerValorPlato();
        }
        subtotal = subt;
    }
    public String obtenerNombre(){
    return nombreCliente;
    }
    public double obtenerIva(){
    return iva;
    }
    public ArrayList<Menu> obtenerMenus() {
    return menuSolicitado;
    }
    public double obtenerValorPagar() {
        return vPagar;
    }

    public double obtenerSubtotal() {
        return subtotal;
    }
    @Override
    public String toString() {
        String cadena = String.format("Factura\n"
                + "Cliente: %s\n",
                nombreCliente);
        for (int i = 0; i < menuSolicitado.size(); i++) {
            cadena = String.format("%s"
                    + "%s\n",
                    cadena,
                    menuSolicitado.get(i));

        }
        cadena = String.format("\n%s"
                + "Subtotal: %.2f\n"
                + "Iva: %.2f\n"
                + "Total a pagar: %.2f\n",
                cadena,
                subtotal,
                iva,
                vPagar);
        return cadena;
    }
}
