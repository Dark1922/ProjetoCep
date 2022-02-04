package com.projeto.cep.domain.viacep;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ViaCepWebService {

    @Autowired
    private RestTemplate restTemplate;

    private String baseUrl = "http://viacep.com.br/ws";
    private String type = "/json";

    public EnderecoDTO viaCepWebService(String cep) {
        Map<String, String> uriVariables = new HashMap<>();
        uriVariables.put("cep", cep.toString());
       // System.out.println(baseUrl + "/{cep}" + type);
        ResponseEntity<EnderecoDTO> result = restTemplate.getForEntity(baseUrl + "/{cep}" + type, EnderecoDTO.class, uriVariables);
        return result.getBody();
    }
}
