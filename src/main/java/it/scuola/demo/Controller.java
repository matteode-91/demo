package it.scuola.demo;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controller {    //Classe Controller

    @GetMapping("/api/GET")    //Percorso della GET
    public Map<String, Object> hello() {   //Funzione di tipo stringa
        return Map.of(        //restituisce il messaggio sottostante
                "message", "Hello dalla API Spring!", //messaggio che viene restituito sul browser/postman o curl
                "ok", true
        );
    }

   @GetMapping("/richiamo/funzione")
   public Map<String, Object> ciao() {
   return hello(); //richiama la funzione hello e restituisce il testo
   }
}