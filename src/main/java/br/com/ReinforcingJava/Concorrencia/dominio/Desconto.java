package br.com.ReinforcingJava.Concorrencia.dominio;





public class Desconto {
    public enum Code{
        NONE(0), A(5),
        B(10),C(15);
        private final int porcentagem;

        Code(int porcentagem) {
            this.porcentagem = porcentagem;
        }

        public int getPorcentagem() {
            return porcentagem;
        }
    }
}
