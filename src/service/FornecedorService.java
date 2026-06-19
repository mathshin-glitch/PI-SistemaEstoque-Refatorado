package service;

import dao.FornecedorDAO;
import classes.Fornecedor;

public class FornecedorService {

    private FornecedorDAO fornecedorDAO;

    public FornecedorService() {
        this.fornecedorDAO = new FornecedorDAO();
    }

    public void cadastrarFornecedor(Fornecedor fornecedor) {
        fornecedorDAO.inserir(fornecedor);
    }
}
