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
public class IteraPasantes implements Iterator{
    
    private Estudiante[] estudiantes;
    private int numEstudiantes,posicion;

    public IteraPasantes(Estudiante[] estudiantes, int numEstudiantes) {
        this.estudiantes = estudiantes;
        this.numEstudiantes = numEstudiantes;
        
    }

    @Override
    public Estudiante next() {
        return estudiantes[posicion++];
    }

    @Override
    public boolean hasNext() {
       return posicion < estudiantes.length;
    }

    @Override
    public Estudiante previous() {
        return estudiantes[posicion--];
    }

    @Override
    public void restart() {
        posicion = 0;
    }

    @Override
    public boolean isFisrt() {
        return true;
    }
    
}
