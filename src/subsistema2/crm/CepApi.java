package subsistema2.crm;

import one.digitalinnovation.gof.singleton.SingletonEager;




    public class CepApi {

        private static CepApi instancia = new CepApi();

        private CepApi() {
            super();
        }

        public static CepApi getInstancia() {
            return instancia;
        }

        public String recuperarCidade(String cep) {
            return "Tubarão";
        }

        public String recuperarEstado(String cep) {
            return "SC";
        }
    }

