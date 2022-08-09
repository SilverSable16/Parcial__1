/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial_1;

/**
 *
 * @author JPonce
 */
public class Helicoptero extends Vehiculo_aereo{
    private String caja_cambios, rotor_principal, eje_accionamiento, control_vuelo, helices;

    public String getCaja_cambios() {
        return caja_cambios;
    }

    public void setCaja_cambios(String caja_cambios) {
        this.caja_cambios = caja_cambios;
    }

    public String getRotor_principal() {
        return rotor_principal;
    }

    public void setRotor_principal(String rotor_principal) {
        this.rotor_principal = rotor_principal;
    }

    public String getEje_accionamiento() {
        return eje_accionamiento;
    }

    public void setEje_accionamiento(String eje_accionamiento) {
        this.eje_accionamiento = eje_accionamiento;
    }

    public String getControl_vuelo() {
        return control_vuelo;
    }

    public void setControl_vuelo(String control_vuelo) {
        this.control_vuelo = control_vuelo;
    }

    public String getHelices() {
        return helices;
    }

    public void setHelices(String helices) {
        this.helices = helices;
    }
    
}
