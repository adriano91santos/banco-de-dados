package com.example.appminhaideiadb.controller;

import java.util.List;

public interface ICrud<T> {

    // Metodos para persistência de dados no banco de dados

    // Incluir
    public boolean incluir(T obj);

    // Alterar
    public boolean alterar(T obj);

    // Deletar
    public boolean deletar(T obj);

    // Listar
    public List<T> listar();

    // Crud = Create Retrieve Update Delete


}
