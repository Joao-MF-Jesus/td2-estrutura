package model;

public class Agencia {
    private int numero;
    private String nome;

    public Agencia(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Agência [número=" + numero + ", nome=" + nome + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Agencia) {
            Agencia outra = (Agencia) obj;
            return this.numero == outra.numero;
        }
        return false;
    }
}
