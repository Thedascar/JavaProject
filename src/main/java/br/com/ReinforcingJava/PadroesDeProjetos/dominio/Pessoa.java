package br.com.ReinforcingJava.PadroesDeProjetos.dominio;

public class Pessoa {
    private  String nome;
    private String sobrenome;
    private String nomeUsuario;
    private String email;

    public String getNome() {
        return nome;
    }

    public static final class PessoaBuilder {
        private String nome;
        private String sobrenome;
        private String nomeUsuario;
        private String email;

        public PessoaBuilder() {
        }

        public static PessoaBuilder builder() {
            return new PessoaBuilder();
        }

        public PessoaBuilder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public PessoaBuilder sobrenome(String sobrenome) {
            this.sobrenome = sobrenome;
            return this;
        }

        public PessoaBuilder nomeUsuario(String nomeUsuario) {
            this.nomeUsuario = nomeUsuario;
            return this;
        }

        public PessoaBuilder email(String email) {
            this.email = email;
            return this;
        }

        public Pessoa build() {
            Pessoa pessoa = new Pessoa();
            pessoa.nomeUsuario = this.nomeUsuario;
            pessoa.email = this.email;
            pessoa.sobrenome = this.sobrenome;
            pessoa.nome = this.nome;
            return pessoa;
        }
    }
}
