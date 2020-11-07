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
public class Pasantes implements Estudiantes{
    private final Estudiante estudiantes[];
    private int indice;
    
    public Pasantes(int tam) {
        estudiantes = new Estudiante[tam];
    }

    @Override
    public Iterator getIterator() {
        return new IteraPasantes(estudiantes, estudiantes.length);
    }

    @Override
    public void addEstudiante(Estudiante estudiante) {
        estudiantes[indice++] = estudiante;
    }
    
}
