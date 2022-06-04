package Entidades;

import Funcoes.Util;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author SAMUEL
 */
public class ServicoDeCep {
    
    // WebService de onde está sendo consumida
    static String webService = "http://viacep.com.br/ws/";
    // Codigo de sucesso da requisição
    static int codigoSucesso = 200;
    
    public static EnderecoCliente buscaEnderecoPelo(String cep) throws Exception{
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
            EnderecoCliente endereco = gson.fromJson(jsonEmString, EnderecoCliente.class);
                
            return endereco;
        } catch (IOException | RuntimeException e) {
            throw new Exception("Erro: " + e);
        }
    }
    
}
