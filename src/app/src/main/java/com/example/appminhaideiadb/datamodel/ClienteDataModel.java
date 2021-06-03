package com.example.appminhaideiadb.datamodel;

public class ClienteDataModel {

    // Modelo Objeto Relacional

    // Toda classe DataModel tem essa estrutura:

    // 1 - Criar atributo nome da tabela
    public static final String TABELA = "cliente";

    // 2 - Atributos com os nomes dos campos
    public static final String ID = "id";
    public static final String NOME = "nome";
    public static final String EMAIL = "email";

    // 3 - Query para criar a tabela no banco de dados
    public static String queryCriarTabela = "";

    // 4 - Método para gerar o script para criar a tabela

    public static String criarTabela(){

        // Concatenação de String

        queryCriarTabela += "CREATE TABLE " + TABELA + " (";
        queryCriarTabela += ID + " integer primary key autoincrement, ";
        queryCriarTabela += NOME + " text, "; // nome texto
        queryCriarTabela += EMAIL + " text ";
        queryCriarTabela += ")";

        return queryCriarTabela;
    }
}
