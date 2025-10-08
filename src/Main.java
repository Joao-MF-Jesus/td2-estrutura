import model.Agencia;
import view.ViewAgencia;
import view.ViewConta;

public class Main {
    public static void main(String[] args) {
        ViewAgencia viewAgencia = new ViewAgencia();
        viewAgencia.executar();

        Agencia agencia = viewAgencia.getController().buscar(1);

        ViewConta viewConta = new ViewConta();
        viewConta.executar(agencia);
    }
}
