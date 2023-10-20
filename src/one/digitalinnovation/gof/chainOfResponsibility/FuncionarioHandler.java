package one.digitalinnovation.gof.chainOfResponsibility;

public class FuncionarioHandler implements DespesaHandler {
    private static final double LIMITE = 100.0;
    private DespesaHandler proximoHandler;

    @Override
    public void aprovarDespesa(Despesa despesa) {
        if (despesa.getValor() <= LIMITE) {
            System.out.println("Despesa aprovada pelo funcionário");
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


