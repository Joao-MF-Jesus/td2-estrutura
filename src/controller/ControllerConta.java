package controller;

import model.Agencia;
import model.Conta;
import model.DaoConta;

public class ControllerConta {
    private DaoConta dao;

    public ControllerConta() {
        dao = new DaoConta();
    }

    public void cadastrar(int numero, Agencia agencia) {
        Conta conta = new Conta(numero, agencia);
        dao.inserir(conta);
    }

    public Conta buscar(int numero, Agencia agencia) {
        return dao.buscar(numero, agencia);
    }

    public boolean remover(int numero, Agencia agencia) {
        return dao.remover(numero, agencia);
    }

    public void listar() {
        for (int i = 0; i < dao.listar().size(); i++) {
            System.out.println(dao.listar().get(i));
        }
    }
}
