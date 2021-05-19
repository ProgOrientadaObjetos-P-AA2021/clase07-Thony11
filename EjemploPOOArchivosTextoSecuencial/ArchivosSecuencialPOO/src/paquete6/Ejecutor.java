/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

/**
 *
 * @author Lenovo
 */
public class Ejecutor {

    public static void main(String[] args) {

        
        Hospital h1 = new Hospital("Hospital Básico San Gregorio", 15, 1234.56);
        Hospital h2 = new Hospital("Hospital Clínica San Agustín", 12, 123.123);
        Hospital h3 = new Hospital("Clínica Hospital San José", 14, 1223.12);

        String nombreArchivo = "hospital.txt";

        Hospital[] lista = {h1, h2, h3};

        ArchivoEscritura archivo = new ArchivoEscritura(nombreArchivo);

        for (int i = 0; i < lista.length; i++) {
            // establecer el valor del atributo registro
            archivo.establecerRegistro(lista[i]);
            // establecer en el archivo el atributo del registro
            archivo.establecerSalida();
        }

        archivo.cerrarArchivo();
        
        ArchivoLectura lectura = new ArchivoLectura(nombreArchivo);
        lectura.establecerLista();
        System.out.println(lectura);
    }

}
