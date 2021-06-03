package com.example.appminhaideiadb.controller;

import android.content.Context;
import android.util.Log;

import com.example.appminhaideiadb.api.AppUtil;
import com.example.appminhaideiadb.datasource.AppDataBase;

public class ClienteController extends AppDataBase {

    //Construtor que recebe o contexto e passa o contexto para superclasse
    public ClienteController(Context context) {
        super(context);

        Log.d(AppUtil.TAG, "ClienteController: Conectado");
    }
}
