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
public class ControlEscolar {
    private Estudiantes estudiantes;
    private Estudiantes pasantes;

    public ControlEscolar() {
        estudiantes = new Inscritos();
        pasantes = new Pasantes(6);
    }
    
    
    
    public void inscribir(){
        estudiantes.addEstudiante(new Estudiante(100, 1, 0, 0,"Carlos Mora Paz","Sistemas"));
        estudiantes.addEstudiante(new Estudiante(101, 1, 0, 0,"Maria Cadenas Libres","Sistemas"));
        estudiantes.addEstudiante(new Estudiante(102, 1, 0, 0,"Estela Lopez Cruz","Sistemas"));
        estudiantes.addEstudiante(new Estudiante(103, 1, 0, 0,"Marcos I Matias","Sistemas"));
        estudiantes.addEstudiante(new Estudiante(104, 1, 0, 0,"Juana Alonso Rios","Sistemas"));
        estudiantes.addEstudiante(new Estudiante(105, 1, 0, 0,"Esteban Cruz Paz","Sistemas"));
    }
    
    public void reincribir(){
        Iterator it = estudiantes.getIterator();
        Estudiante temp = null;
        while (it.hasNext()) {
            temp  = it.next();
            temp.setSemestre(temp.getSemestre()+1);
            temp.setCreditosCursos(temp.getCreditosCursos()+30);
        }
        
    }
    
    
    public void concluirResidencia(){
        
        Iterator it = estudiantes.getIterator();
        while (it.hasNext()) {
            it.next().setCreditosResidencia(20);
        }
        
        Iterator ip = pasantes.getIterator();
        it.restart();
        while(ip.hasNext()){
            pasantes.addEstudiante(it.next());
            ip.next();
        }
    }
    
    public void imprimir(String mensaje){
        System.out.println("\n"+mensaje);
        System.out.printf("%-20s%-22s%-20s%-20s%-20s%-20s\n","NUM. CONTROL","NOMBRE","CARRERA","SEMESTRE","CRED.CURSOS","CRED.RESIDENCIA");
        Iterator it = estudiantes.getIterator();
        while (it.hasNext()) {
            Estudiante temp = it.next();
            System.out.printf("%-20s%-22s%-20s%-20s%-20s%-20s\n",
                             temp.getNumControl(),temp.getNombre(),
                             temp.getCarrera(),temp.getSemestre(),temp.getCreditosCursos(),temp.getCreditosResidencia());  
        }
    }
    
    
}
