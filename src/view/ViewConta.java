package view;

import controller.ControllerConta;
import model.Agencia;

public class ViewConta {

    private ControllerConta controller;

    public ViewConta() {
        controller = new ControllerConta();
    }

    public void executar(Agencia agencia) {
        controller.cadastrar(100, agencia);
        controller.cadastrar(200, agencia);
        controller.listar();
    }
}
