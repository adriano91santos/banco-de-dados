package com.example.appminhaideiadb.datamodel;

public class ProdutoDataModel {

    public static final String TABELA = "produto";

    public static final String ID = "id"; // integer
    public static final String NOME = "nome"; // text
    public static final String FORNECEDOR = "fornecedor"; // text

    public static String queryCriarTabela = "";

    public static String criarTabela() {

        queryCriarTabela += "CREATE TABLE " + TABELA + " (";
        queryCriarTabela += ID + " integer primary key autoincrement, ";
        queryCriarTabela += NOME + " text, ";
        queryCriarTabela += FORNECEDOR + " text ";
        queryCriarTabela += ")";

        return queryCriarTabela;

    }

}
