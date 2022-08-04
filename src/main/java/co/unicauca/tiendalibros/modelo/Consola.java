/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.tiendalibros.modelo;

import java.awt.image.BufferedImage;
import java.io.*;
import java.util.*;
import javax.imageio.ImageIO;

/**
 *
 * @author Juan Medicis
 */
public class Consola {

    //Herramientas
    public static String Fecha(){
        Calendar fecha = new GregorianCalendar();
        int año = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH);
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        return (dia + "/" + (mes+1) + "/" + año);
    }
    public static void Esperar(int prmSegundos) {
        try {
            //Ponemos a "Dormir" el programa durante los ms que queremos
            Thread.sleep(prmSegundos * 1000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static String codificarImagen(File file){
        String encodedfile = null;
        try {
            FileInputStream fileInputStreamReader = new FileInputStream(file);
            byte[] bytes = new byte[(int)file.length()];
            fileInputStreamReader.read(bytes);
            encodedfile = new String (Base64.getEncoder().encode(bytes), "UTF-8");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return encodedfile;
    }
    
    public static BufferedImage decodificarImagen(String encodedString){
        byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
        String decodedString = new String(decodedBytes);
        ByteArrayInputStream bais = new ByteArrayInputStream(decodedBytes);
        try {
            return ImageIO.read(bais);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //Leer
    public static String LeerCadena() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextLine();
    }

    public static int LeerEntero() {
        Scanner Numero = new Scanner(System.in);
        return Numero.nextInt();
    }

    public static double LeerDecimas() {
        Scanner Numero = new Scanner(System.in);
        return Numero.nextDouble();
    }

    //Escribir
    public static void Escribir(String prmTexto) {
        System.out.println(prmTexto);
    }
}
