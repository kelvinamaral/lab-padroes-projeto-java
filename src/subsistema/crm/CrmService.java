package subsistema.crm;

public class CrmService {

    private CrmService() {
        super();
    }

    public static void gravarCliente(String nome, String cep, String cidade, String estado){
        System.out.println("Cliete Salvo no Sistema de CRM:");
        System.out.println(nome);
        System.out.println(cidade);
        System.out.println(estado);
        System.out.println(cep);
    }
}
