/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomina;

/**
 *
 * @author lavor
 */
public class test {
    public static void main(String [] args) {
          INTERFACE ingeniero = new INTERFACE("David","Salado", "Patiño" );
         
         ingeniero.mostrarDatos();
          ingeniero.trabajo();
         
         PROGRAMADOR programador = new PROGRAMADOR("Raul","Gomez", "Prado" );
         
         programador .mostrarDatos();
         programador.trabajo();
    }
}
