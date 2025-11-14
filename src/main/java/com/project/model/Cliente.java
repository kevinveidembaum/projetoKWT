package com.project.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome é obrigatório")
    @Size(max = 100, message = "O nome deve ter no máximo 100 caracteres")
    private String nome;

    @NotBlank(message = "O CNPJ é obrigatório")
    @Size(max = 18, message = "O CNPJ deve ter no máximo 18 caracteres (formato XX.XXX.XXX/0001-XX)")
    private String cnpj;

    @NotBlank(message = "O endereço é obrigatório")
    @Size(max = 200, message = "O endereço deve ter no máximo 200 caracteres")
    private String endereco;

    @NotBlank(message = "O telefone é obrigatório")
    @Size(max = 15, message = "O telefone deve ter no máximo 15 caracteres")
    private String telefone;

    @Email(message = "Email inválido")
    @Size(max = 150, message = "O email deve ter no máximo 150 caracteres")
    private String email;

    @NotBlank(message = "A forma de pagamento é obrigatória")
    @Size(max = 50, message = "A forma de pagamento deve ter no máximo 50 caracteres")
    private String formapagto;

    @NotBlank(message = "O status é obrigatório")
    @Size(max = 10, message = "O status deve ser 'ativo' ou 'inativo'")
    private String status;

    public Cliente() {
    }

    public Cliente(String nome, String cnpj, String endereco, String telefone, String email,
                   String formapagto, String status) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.formapagto = formapagto;
        this.status = status;
    }

    // Getters e Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFormapagto() {
        return formapagto;
    }

    public void setFormapagto(String formapagto) {
        this.formapagto = formapagto;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}