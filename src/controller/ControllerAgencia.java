//João marcelo ferreira de jesus
package controller;

import model.Agencia;
import model.DaoAgencia;

public class ControllerAgencia {
    private DaoAgencia dao;

    public ControllerAgencia() {
        dao = new DaoAgencia();
    }

    public void cadastrar(int numero, String nome) {
        Agencia agencia = new Agencia(numero, nome);
        dao.inserir(agencia);
    }

    public Agencia buscar(int numero) {
        return dao.buscar(numero);
    }

    public boolean remover(int numero) {
        return dao.remover(numero);
    }

    public void listar() {
        for (int i = 0; i < dao.listar().size(); i++) {
            System.out.println(dao.listar().get(i));
        }
    }
}
