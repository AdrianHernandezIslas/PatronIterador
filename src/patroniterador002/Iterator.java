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
public interface Iterator {
    public Estudiante next();
    public boolean hasNext();
    public Estudiante previous();
    public void restart();
    public boolean isFisrt();
}
