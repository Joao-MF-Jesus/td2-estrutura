package model.util;

import java.util.function.Predicate;

public class ListaArray<T> {

    private Object[] elementos;
    private int tamanho;

    public ListaArray() {
        this(10); // capacidade inicial padrão
    }

    public ListaArray(int capacidadeInicial) {
        if (capacidadeInicial <= 0) {
            capacidadeInicial = 10;
        }
        elementos = new Object[capacidadeInicial];
        tamanho = 0;
    }

    public void add(T elemento) {
        if (tamanho == elementos.length) {
            crescer();
        }
        elementos[tamanho++] = elemento;
    }

    public boolean remove(T elemento) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i].equals(elemento)) {
                for (int j = i; j < tamanho - 1; j++) {
                    elementos[j] = elementos[j + 1];
                }
                elementos[--tamanho] = null;
                return true;
            }
        }
        return false;
    }

    @SuppressWarnings("unchecked")
    public T get(int index) {
        if (index < 0 || index >= tamanho) {
            throw new IndexOutOfBoundsException("Índice inválido: " + index);
        }
        return (T) elementos[index];
    }

    public int size() {
        return tamanho;
    }

    private void crescer() {
        int novaCapacidade = elementos.length * 2;
        Object[] novoArray = new Object[novaCapacidade];
        for (int i = 0; i < elementos.length; i++) {
            novoArray[i] = elementos[i];
        }
        elementos = novoArray;
    }

    @SuppressWarnings("unchecked")
    public T find(Predicate<T> condicao) {
        for (int i = 0; i < tamanho; i++) {
            T elemento = (T) elementos[i];
            if (condicao.test(elemento)) {
                return elemento;
            }
        }
        return null;
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }

    public void clear() {
        elementos = new Object[10];
        tamanho = 0;
    }
}
