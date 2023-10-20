package one.digitalinnovation.gof.chainOfResponsibility;

public class GerenteHandler implements DespesaHandler {
    private static final double LIMITE = 750.0;
    private DespesaHandler proximoHandler;

    @Override
    public void aprovarDespesa(Despesa despesa) {
        if (despesa.getValor() <= LIMITE) {
            System.out.println("Despesa aprovada pelo gerente");
        } else if (proximoHandler != null) {
            proximoHandler.aprovarDespesa(despesa);
        } else {
            System.out.println("A despesa excede o limite e requer aprovação adicional.");
        }
    }

    public void setProximoHandler(DespesaHandler proximoHandler) {
        this.proximoHandler = proximoHandler;
    }
}
