/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial_1;

/**
 *
 * @author JPonce
 */
abstract class Vehiculo {
    private String modelo, tipo_vehiculo, matricula, papeles_propiedad;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo_vehiculo() {
        return tipo_vehiculo;
    }

    public void setTipo_vehiculo(String tipo_vehiculo) {
        this.tipo_vehiculo = tipo_vehiculo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getPapeles_propiedad() {
        return papeles_propiedad;
    }

    public void setPapeles_propiedad(String papeles_propiedad) {
        this.papeles_propiedad = papeles_propiedad;
    }
    
}
