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
public class Inscritos implements Estudiantes{
    
    private ArrayList<Estudiante> estudiantes;

    public Inscritos() {
        estudiantes = new ArrayList();
    }

    @Override
    public Iterator getIterator() {
        return new IteraInscritos(estudiantes);
    }

    @Override
    public void addEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }
    
}
