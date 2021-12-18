package com.rafaelvieira.covidopenfeign.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddressDTO {

    //@JsonProperty responsavel por especificar o nome do atributo no JSON correto
    @JsonProperty("cep")
    private String zipCode;

    @JsonProperty("logradouro")
    private String address;

    @JsonProperty("bairro")
    private String district;

    @JsonProperty("cidade")
    private String city;

    @JsonProperty("estado")
    private String state;

}
