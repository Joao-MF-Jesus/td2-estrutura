//João marcelo ferreira de jesus
package model;

public class Conta {
    private int numero;
    private Agencia agencia;
    private double saldo;

    public Conta(int numero, Agencia agencia) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = 0.0;
    }

    public int getNumero() {
        return numero;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Conta [número=" + numero + ", agência=" + agencia.getNumero() + ", saldo=" + saldo + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Conta) {
            Conta outra = (Conta) obj;
            return this.numero == outra.numero && this.agencia.equals(outra.agencia);
        }
        return false;
    }
}
