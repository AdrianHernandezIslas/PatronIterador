/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patroniterador002;

/**
 *
 * @author adrian
 */
public class Estudiante {
    private int numControl,semestre,creditosCursos,creditosResidencia;
    private String nombre,carrera;

    public Estudiante(int numControl, int semestre, int creditosCursos, int creditosResidencia, String nombre, String carrera) {
        this.numControl = numControl;
        this.semestre = semestre;
        this.creditosCursos = creditosCursos;
        this.creditosResidencia = creditosResidencia;
        this.nombre = nombre;
        this.carrera = carrera;
    }

    public int getNumControl() {
        return numControl;
    }

    public int getSemestre() {
        return semestre;
    }

    public int getCreditosCursos() {
        return creditosCursos;
    }

    public int getCreditosResidencia() {
        return creditosResidencia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCreditosCursos(int creditosCursos) {
        this.creditosCursos = creditosCursos;
    }

    public void setCreditosResidencia(int creditosResidencia) {
        this.creditosResidencia = creditosResidencia;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
    
    
    
}
