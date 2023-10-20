package one.digitalinnovation.gof.chainOfResponsibility;

public class ChainOfResponsibilityExemplo {
    public static void main(String[] args) {
        DespesaHandler funcionario = new FuncionarioHandler();
        DespesaHandler gerente = new GerenteHandler();
        DespesaHandler diretor = new DiretorHandler();

        funcionario.setProximoHandler(gerente);
        gerente.setProximoHandler(diretor);

        Despesa despesa1 = new Despesa(50.0);
        Despesa despesa2 = new Despesa(300.0);
        Despesa despesa3 = new Despesa(1200.0);

        funcionario.aprovarDespesa(despesa1);
        funcionario.aprovarDespesa(despesa2);
        funcionario.aprovarDespesa(despesa3);
    }
}