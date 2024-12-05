package com.c9tecnologia.comercial.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Data
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String situacao;
    private String pessoa;
    private String cnpjcpf;
    private String rg;
    private String razaoSocial;
    private LocalDate dataNascimento;
    private String nomeFantasia;
    private String sexo;
    private String estadoCivil;
    private String cep;
    private String endereco;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String ibge;
    private String estado;
    private String celular;
    private String email;
    private String obs;
    private String tipoCadastro;
    private String profissao;
    private String categoria;
    private String listaPreco;
    private String condicaoPagamento;
    private String contaBancaria;
    private Double limiteCredito;
    private Boolean limiteUltrapassar;
    private LocalDate dataInicial;
    private LocalDate dataFinal;
    private LocalDate dataCadastro;
    private LocalTime horaCadastro;
    private String horario;
    private Boolean deveReceberSms;
    private Boolean deveReceberTorpedoVoz;
    private String criadoPor;
    private String atualizadoPor;
}
