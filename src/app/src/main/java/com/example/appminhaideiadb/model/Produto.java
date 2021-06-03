package com.example.appminhaideiadb.model;

import android.util.Log;

import com.example.appminhaideiadb.api.AppUtil;
import com.example.appminhaideiadb.controller.ICrud;

public class Produto implements ICrud {

    private String nome;
    private String fornecedor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    @Override
    public void incluir() {
        Log.i(AppUtil.TAG, "incluir: Produto");
    }

    @Override
    public void alterar() {
        Log.i(AppUtil.TAG, "alterar: Produto");
    }

    @Override
    public void deletar() {
        Log.i(AppUtil.TAG, "deletar: Produto");
    }

    @Override
    public void listar() {
        Log.i(AppUtil.TAG, "listar: Produtos");
    }
}
