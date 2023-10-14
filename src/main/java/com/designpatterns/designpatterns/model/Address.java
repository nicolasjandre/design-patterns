package com.designpatterns.designpatterns.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "address")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Address {

    @Id
    public String cep;

    @Column(name = "adr_tx_logradouro")
    public String logradouro;

    @Column(name = "adr_tx_complemento")
    public String complemento;

    @Column(name = "adr_tx_bairro")
    public String bairro;

    @Column(name = "adr_tx_localidade")
    public String localidade;

    @Column(name = "adr_tx_uf")
    public String uf;

    @Column(name = "adr_tx_ibge")
    public String ibge;

    @Column(name = "adr_tx_gia")
    public String gia;

    @Column(name = "adr_tx_ddd")
    public String ddd;

    @Column(name = "adr_tx_siafi")
    public String siafi;

}
