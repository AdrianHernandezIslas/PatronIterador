/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patroniterador002;

import java.util.ArrayList;

/**
 *
 * @author adrian
 */
public class IteraInscritos implements Iterator{
    
    private ArrayList<Estudiante> estudiantes;
    private int posicion;

    public IteraInscritos(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
        
    }

    @Override
    public Estudiante next() {
        return estudiantes.get(posicion++);
    }

    @Override
    public boolean hasNext() {
        return posicion<estudiantes.size();
    }

    @Override
    public Estudiante previous() {
       return estudiantes.get(posicion--);
    }

    @Override
    public void restart() {
        posicion = 0;
    }

    @Override
    public boolean isFisrt() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
