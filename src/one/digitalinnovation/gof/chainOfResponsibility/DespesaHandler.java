package one.digitalinnovation.gof.chainOfResponsibility;

public interface DespesaHandler {
    void aprovarDespesa (Despesa despesa);

    void setProximoHandler(DespesaHandler gerente);
}
