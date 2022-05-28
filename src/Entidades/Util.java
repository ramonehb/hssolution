/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.io.BufferedReader;
import java.io.IOException;

/**
 *
 * @author SAMUEL
 */
public class Util {
    public static String converteJsonEmString(BufferedReader buffereReader) throws IOException{
        String resposta, jsonEmString = "";
        
        while((resposta = buffereReader.readLine()) != null){
            jsonEmString += resposta;
        }
        
        return jsonEmString;
    }
}
