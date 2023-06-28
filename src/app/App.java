
package app;

import entidad.DNI;
import entidad.Persona;


public class App {


    public static void main(String[] args) {
        
        DNI dni = new DNI();
        dni.setSerie('A');
        dni.setNumero(42759062);
        
        Persona persona = new Persona();
        persona.setNombre("Juan");
        persona.setApellido("Vilchez");
        persona.setDni(dni);
        
        System.out.println(persona.toString());
    }
    
}
