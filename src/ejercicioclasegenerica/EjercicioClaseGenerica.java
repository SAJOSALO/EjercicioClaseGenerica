/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioclasegenerica;

import java.util.Scanner;
import org.json.JSONArray;
import supabase.Supabase;

/**
 *
 * @author Lenovo
 */
public class EjercicioClaseGenerica {

static private Supabase supabase = new Supabase("https://eddheowwvrmqrzgnioyu.supabase.co/", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6ImVkZGhlb3d3dnJtcXJ6Z25pb3l1Iiwicm9sZSI6ImFub24iLCJpYXQiOjE3MjQ5NzM3NTksImV4cCI6MjA0MDU0OTc1OX0.8CeHFM_IU64MM3YWM_sj4ORDymFcQQsKikiVX0lq-Xw");
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su Edad:");
        Integer edad = sc.nextInt();
        sc.nextLine();  
        System.out.println("Ingrese su Nombre:");
        String nombre = sc.nextLine();
        System.out.println("Ingrese su Eps:");
        String eps = sc.nextLine();
        System.out.println("Ingrese su Fecha de Nacimiento:");
        String fnacimiento = sc.nextLine();
        
        
        Pair<Integer, String> persona = new Pair<>(edad, nombre);

        Pair<String, String> datosPersonales = new Pair<>(eps, fnacimiento);

        
 
        JSONArray personaJsonArray = new JSONArray("[{\"edad\":\"" + persona.getFirst() + "\", \"nombre\":\""+persona.getSecond()+"\"}]");
        
        JSONArray datosPersonalesJsonArray = new JSONArray("[{\"fecha_nacimiento\":\"" + datosPersonales.getSecond() + "\", \"eps\":\""+datosPersonales.getFirst()+"\"}]");
        
        supabase.from("persona").insert(personaJsonArray);
        supabase.from("datosPersonales").insert(datosPersonalesJsonArray);
              
    }
    
}
