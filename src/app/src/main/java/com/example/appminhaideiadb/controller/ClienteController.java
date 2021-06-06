package com.example.appminhaideiadb.controller;

import android.content.ContentValues;
import android.content.Context;
import android.util.Log;

import com.example.appminhaideiadb.api.AppUtil;
import com.example.appminhaideiadb.datamodel.ClienteDataModel;
import com.example.appminhaideiadb.datasource.AppDataBase;
import com.example.appminhaideiadb.model.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteController extends AppDataBase implements ICrud<Cliente> {


    ContentValues dadoDoObjeto;

    //Construtor que recebe o contexto e passa o contexto para superclasse
    public ClienteController(Context context) {
        super(context);

        Log.d(AppUtil.TAG, "ClienteController: Conectado");
    }

    @Override
    public boolean incluir(Cliente obj) {
        dadoDoObjeto = new ContentValues();
        // Key, valor.

        dadoDoObjeto.put(ClienteDataModel.NOME, obj.getNome());
        dadoDoObjeto.put(ClienteDataModel.EMAIL, obj.getEmail());

        return true;

    }

    @Override
    public boolean alterar(Cliente obj) {
        dadoDoObjeto = new ContentValues();
        // Key, valor.

        // ID é a chave primaria da tabela cliente
        // É gerada automaticamente pelo SQLite a cada
        // novo registro adicionado
        // SQL ---> UPDATE
        dadoDoObjeto.put(ClienteDataModel.ID, obj.getId());
        dadoDoObjeto.put(ClienteDataModel.NOME, obj.getNome());
        dadoDoObjeto.put(ClienteDataModel.EMAIL, obj.getEmail());

        return true;

    }

    @Override
    public boolean deletar(Cliente obj) {
        dadoDoObjeto = new ContentValues();
        // Key, valor.

        // SQL ---> DELETE from TABELA WHERE ID = ???
        dadoDoObjeto.put(ClienteDataModel.ID, obj.getId());

        return true;

    }

    @Override
    public List<Cliente> listar(Cliente obj) {

        List<Cliente> list = new ArrayList<>();

        return list;

    }
}
