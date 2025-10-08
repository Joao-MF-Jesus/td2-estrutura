//João marcelo ferreira de jesus
package model;

import model.util.ListaArray;

public class DaoAgencia {
    private ListaArray<Agencia> lista;

    public DaoAgencia() {
        lista = new ListaArray<>();
    }

    public void inserir(Agencia agencia) {
        if (buscar(agencia.getNumero()) == null) {
            lista.add(agencia);
        }
    }

    public Agencia buscar(int numero) {
        return lista.find(a -> a.getNumero() == numero);
    }

    public boolean remover(int numero) {
        Agencia agencia = buscar(numero);
        if (agencia != null) {
            return lista.remove(agencia);
        }
        return false;
    }

    public ListaArray<Agencia> listar() {
        return lista;
    }
}
