/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inversiondependencia;

/**
 *
 * @author Carlos
 */
public class Vehiculo {
    private Color color;
    private String placa;
    private String marca;
    private TipoVehiculo tipovehiculo;

    public Vehiculo(Color color, String placa, String marca, TipoVehiculo tipovehiculo) {
        this.color = color;
        this.placa = placa;
        this.marca = marca;
        this.tipovehiculo = tipovehiculo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public TipoVehiculo getTipovehiculo() {
        return tipovehiculo;
    }

    public void setTipovehiculo(TipoVehiculo tipovehiculo) {
        this.tipovehiculo = tipovehiculo;
    }
    
    
    
}

