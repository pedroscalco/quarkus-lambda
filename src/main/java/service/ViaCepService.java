package service;

// import com.amazonaws.services.lambda.runtime.Context;

// import model.OutputObject;

// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.net.URL;

// import org.json.JSONObject;

// import java.net.HttpURLConnection;

public class ViaCepService {
    // public OutputObject process(String cep) {
        
    //     String urlViaCep = "http://viacep.com.br/ws/" + cep + "/json";
    //     URL url = new URL(urlViaCep);

    //         HttpURLConnection conexao = (HttpURLConnection) url.openConnection();

    //         if (conexao.getResponseCode() != 200)
    //             throw new RuntimeException("HTTP error code : " + conexao.getResponseCode());


    //         BufferedReader resposta = new BufferedReader(new InputStreamReader((conexao.getInputStream())));
    //         StringBuilder sb = new StringBuilder();
    //         String line;

    //         while ((line = resposta.readLine()) != null) {
    //             sb.append(line);
    //         }

    //         JSONObject retorno = new JSONObject(sb.toString());

    //     return retorno;
    // }
}
