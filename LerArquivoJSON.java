package PdObserver;

/**
 *
 * @author Luiz Galhardo
 */


import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileReader;
import java.io.IOException;

public class LerArquivoJSON {
    public void lerJson(String[] args) {
        JSONParser parser = new JSONParser();
        
        try {
            
            FileReader reader = new FileReader("C:\\Users\\User\\Desktop\\Arquitetura_Software\\src\\data");
            JSONObject jsonData = (JSONObject) parser.parse(reader);
            
            // Agora você pode acessar os dados do arquivo JSON
            String cidade = (String) jsonData.get("cidade");
            
            System.out.println("Cidade: " + cidade);
            
            
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}
