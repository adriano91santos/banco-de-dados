package com.example.appminhaideiadb.model;

import android.util.Log;

import com.example.appminhaideiadb.api.AppUtil;
import com.example.appminhaideiadb.controller.ICrud;

public class Cliente implements ICrud {

    private int id; // Chave primária no Banco de Dados (necessária para excluir, alterar cliente...)
    private String nome;
    private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void incluir() {
        Log.i(AppUtil.TAG, "incluir: Cliente");
    }

    @Override
    public void alterar() {
        Log.i(AppUtil.TAG, "alterar: Cliente");
    }

    @Override
    public void deletar() {
        Log.i(AppUtil.TAG, "deletar: Cliente");
    }

    @Override
    public void listar() {
        Log.i(AppUtil.TAG, "listar: Clientes");
    }
}
