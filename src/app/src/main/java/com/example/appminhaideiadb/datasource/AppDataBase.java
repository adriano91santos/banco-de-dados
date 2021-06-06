package com.example.appminhaideiadb.datasource;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.example.appminhaideiadb.api.AppUtil;
import com.example.appminhaideiadb.datamodel.ClienteDataModel;
import com.example.appminhaideiadb.datamodel.ProdutoDataModel;

public class AppDataBase extends SQLiteOpenHelper {

    //Atributos que definem nome e versão
    public static final String DB_NAME = "AppMinhaIdeia.sqlite";
    public static final int DB_VERSION = 1;

    SQLiteDatabase db; // com esse objeto estou acessando o Banco de Dados

    //Construtor
    public AppDataBase(Context context) {
        super(context, DB_NAME, null, DB_VERSION);

        Log.d(AppUtil.TAG, "AppDataBase: Criando Banco de Dados");

        db = getWritableDatabase(); // abrindo o banco de dados para escrita
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(ClienteDataModel.criarTabela()); // Irá criar a tabela no Banco de dados

        Log.d(AppUtil.TAG, "onCreate: Tabela cliente criada..." + ClienteDataModel.criarTabela());

        db.execSQL(ProdutoDataModel.criarTabela());

        Log.d(AppUtil.TAG, "onCreate: Tabela produto criada..." + ProdutoDataModel.criarTabela());

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
