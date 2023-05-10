/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Ejecutor02 {
    
    public static void main(String[] args) {
        // 1. Crear una persona de Barrio el Valle de la ciudad de Loja
        Ciudad ciudad1 = new Ciudad("Loja");
        Barrio barrio1 = new Barrio("San Sebastian", ciudad1);
        Persona persona1 = new Persona("Alexito", "1100909909", barrio1);
        System.out.println(persona1);
        
        // 2. Crear una persona del Barrio Central de la ciudad de Cuenca
        Ciudad ciudad2 = new Ciudad("Cuenca");
        Barrio barrio2 = new Barrio("San Cuenca", ciudad2);
        Persona persona2 = new Persona("Cebhas", "12312321321", barrio2);
        System.out.println(persona2);
        
        // 3. Crear una persona del Barrio Centenario de la ciuda de Guayaquil
        Ciudad ciudad3 = new Ciudad("Guayaquil");
        Barrio barrio3 = new Barrio("Perla del Pacifico", ciudad3);
        Persona persona3 = new Persona("Carlos Mejia", "1150631511", barrio3);
        System.out.println(persona3);
        
    }
}
