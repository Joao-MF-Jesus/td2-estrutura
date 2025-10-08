//João marcelo ferreira de jesus
package model;

import model.util.ListaArray;

public class DaoConta {
    private ListaArray<Conta> lista;

    public DaoConta() {
        lista = new ListaArray<>();
    }

    public void inserir(Conta conta) {
        if (buscar(conta.getNumero(), conta.getAgencia()) == null) {
            lista.add(conta);
        }
    }

    public Conta buscar(int numero, Agencia agencia) {
        return lista.find(c -> c.getNumero() == numero && c.getAgencia().equals(agencia));
    }

    public boolean remover(int numero, Agencia agencia) {
        Conta conta = buscar(numero, agencia);
        if (conta != null) {
            return lista.remove(conta);
        }
        return false;
    }

    public ListaArray<Conta> listar() {
        return lista;
    }
}
