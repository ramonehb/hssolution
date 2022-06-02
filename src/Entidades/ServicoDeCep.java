/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.swing.JOptionPane;

/**
 *
 * @author SAMUEL
 */
public class ServicoDeCep {
    
    // WebService de onde está sendo consumida
    static String webService = "http://viacep.com.br/ws/";
    // Codigo de sucesso da requisição
    static int codigoSucesso = 200;
    
    public static Endereco buscaEnderecoPelo(String cep) throws Exception{
        String urlParaChamada = webService + cep + "/json";
        
        try {
            URL url = new URL(urlParaChamada);
            //Objeto chamado Conexao onde faz a requisição pro webservice passando a URL
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();
            
            //Valida se o código da requisição se é diferente do código de sucesso
            if(conexao.getResponseCode() != codigoSucesso){
                throw new RuntimeException("HTTP error code: " + conexao.getResponseCode());
            }
                
            BufferedReader resposta = new BufferedReader(new InputStreamReader((conexao.getInputStream())));
            String jsonEmString = Util.converteJsonEmString(resposta);
                
            Gson gson = new Gson();
            Endereco endereco = gson.fromJson(jsonEmString, Endereco.class);
                
            return endereco;
        } catch (Exception e) {
            throw new Exception("Erro: " + e);
        }
    }
    
}