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
public class PROGRAMADOR extends Persona implements Empleado  {

    public PROGRAMADOR(String nombre, String apellidopaterno, String apellidomaterno) {
        super(nombre, apellidopaterno, apellidomaterno);
    }
           public void mostrarDatos ()
              {
          
                System.out.println("Nombre:"+ getNombre()+
                 "\nApellidomaterno:"+getApellidomaterno()+
                  "\nApellidopaterno:"+getApellidopaterno() );
                          }
      @Override
          public void trabajo(){
              System.out.print("empezó a realizar trabajos de Programador…");
          }
}
