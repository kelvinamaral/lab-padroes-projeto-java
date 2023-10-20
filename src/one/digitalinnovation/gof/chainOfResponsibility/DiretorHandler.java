package one.digitalinnovation.gof.chainOfResponsibility;

public class DiretorHandler implements DespesaHandler {
    private static final double LIMITE = 1000.0;

    @Override
    public void aprovarDespesa(Despesa despesa) {
        if (despesa.getValor() <= LIMITE) {
            System.out.println("Despesa aprovada pelo diretor");
        } else {
            System.out.println("A despesa excede o limite e requer aprovação adicional.");
        }
    }

    @Override
    public void setProximoHandler(DespesaHandler gerente) {

    }
}
