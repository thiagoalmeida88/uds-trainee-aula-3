package br.com.uds.personagem;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/personagens")
public class PersonagemController {


    @PostMapping
    public ResponseEntity criar(@RequestBody Ryu ryu){
        // salvar Ryu
        return new ResponseEntity("Parabéns man! It's great!!!", HttpStatus.CREATED);

    }

}
