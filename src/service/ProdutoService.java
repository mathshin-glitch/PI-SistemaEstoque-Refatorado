package service;

import dao.ProdutoDAO;
import classes.Produto;

public class ProdutoService {

    private ProdutoDAO produtoDAO;

    public ProdutoService() {
        this.produtoDAO = new ProdutoDAO();
    }

    public int cadastrarProduto(Produto produto) {
        return produtoDAO.inserir(produto);
    }
}
