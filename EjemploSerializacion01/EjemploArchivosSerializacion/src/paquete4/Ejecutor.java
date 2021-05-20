/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

/**
 *
 * @author LENOVO
 */
public class Ejecutor {

    public static void main(String[] args) {

        String nombreArchivo = "hospitales.data";

        Hospital h1 = new Hospital("Hospital Básico San Gregorio", 15, 1234.56);
        Hospital h2 = new Hospital("Hospital Clínica San Agustín", 12, 123.123);
        Hospital h3 = new Hospital("Clínica Hospital San José", 14, 1223.12);

 
        EscrituraArchivoSecuencial archivo = new EscrituraArchivoSecuencial
        (nombreArchivo);
        
        archivo.establecerRegistro(h1);
        archivo.establecerSalida();
        archivo.establecerRegistro(h2);
        archivo.establecerSalida();
        archivo.establecerRegistro(h3);
        archivo.establecerSalida();
        archivo.cerrarArchivo();
    
        LecturaArchivoSecuencial lectura = new LecturaArchivoSecuencial
        (nombreArchivo);
        lectura.establecerListaHospital();
        System.out.println(lectura);

    }

}
