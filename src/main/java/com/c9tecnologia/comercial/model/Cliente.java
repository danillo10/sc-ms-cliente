package com.c9tecnologia.comercial.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Data
@Table(name = "cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String situacao;
    private String pessoa;

    @Column(unique = true, nullable = false, length = 25)
    private String cnpjcpf;
    private String rg;
    private String razaoSocial;
    private LocalDate dataNascimento;

    @Column(nullable = false, length = 100)
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

    @Column(unique = true, length = 100)
    private String email;
    private String obs;
    private String tipoCadastro;
    private String profissao;
    private String categoria;
    private String listaPreco;
    private String condicaoPagamento;
    private String contaBancaria;

    @Column(precision = 10, scale = 2)
    private BigDecimal limiteCredito;
    @Column(precision = 10, scale = 2)
    private Boolean limiteUltrapassar;
    private LocalDate dataInicial;
    private LocalDate dataFinal;
    private LocalDate dataCadastro;
    private LocalTime horaCadastro;
    private String horario;
    @Column(nullable = false, columnDefinition = "VARCHAR(3) DEFAULT 'Sim'")
    private Boolean deveReceberSms;
    @Column(nullable = false, columnDefinition = "VARCHAR(3) DEFAULT 'Sim'")
    private Boolean deveReceberTorpedoVoz;
    private String criadoPor;
    private String atualizadoPor;
}
