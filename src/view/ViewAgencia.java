package view;

import controller.ControllerAgencia;

public class ViewAgencia {

    private ControllerAgencia controller;

    public ViewAgencia() {
        controller = new ControllerAgencia();
    }

    public void executar() {
        controller.cadastrar(1, "Centro");
        controller.cadastrar(2, "Zona Norte");
        controller.listar();
    }

    public ControllerAgencia getController() {
        return controller;
    }
}
