package com.example.appminhaideiadb.controller;

import android.content.ContentValues;
import android.content.Context;

import com.example.appminhaideiadb.datamodel.ClienteDataModel;
import com.example.appminhaideiadb.datamodel.ProdutoDataModel;
import com.example.appminhaideiadb.datasource.AppDataBase;
import com.example.appminhaideiadb.model.Produto;

import java.util.ArrayList;
import java.util.List;

public class ProdutoController extends AppDataBase implements ICrud<Produto> {

    ContentValues dadoDoObjeto;

    public ProdutoController(Context context) {
        super(context);
    }

    @Override
    public boolean incluir(Produto obj) {
        dadoDoObjeto = new ContentValues();

        dadoDoObjeto.put(ProdutoDataModel.NOME, obj.getNome());
        dadoDoObjeto.put(ProdutoDataModel.FORNECEDOR, obj.getFornecedor());

        return false;
    }

    @Override
    public boolean alterar(Produto obj) {
        dadoDoObjeto = new ContentValues();

        dadoDoObjeto.put(ProdutoDataModel.ID, obj.getId());
        dadoDoObjeto.put(ProdutoDataModel.NOME, obj.getNome());
        dadoDoObjeto.put(ProdutoDataModel.FORNECEDOR, obj.getFornecedor());

        return false;
    }

    @Override
    public boolean deletar(Produto obj) {
        dadoDoObjeto = new ContentValues();

        dadoDoObjeto.put(ProdutoDataModel.ID, obj.getId());
        return false;
    }

    @Override
    public List<Produto> listar() {
        List<Produto> lista = new ArrayList<>();

        return lista;
    }
}
