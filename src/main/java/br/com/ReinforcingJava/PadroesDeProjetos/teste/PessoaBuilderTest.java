package br.com.ReinforcingJava.PadroesDeProjetos.teste;

import br.com.ReinforcingJava.PadroesDeProjetos.dominio.*;

public class PessoaBuilderTest {
    public static void main(String[] args) {
        Aircraft aircraft = new Aircraft("777");
        Pais pais = Pais.BRAZIL;
        Moeda moeda = MoedaFactory.novaMoeda(pais);
        Pessoa pessoa = new Pessoa.PessoaBuilder()
                .nome("Lucas")
                .sobrenome("Ramon")
                .email("Lucas@zhomini")
                .nomeUsuario("Zausting")
                .build();


        ReportDto reportDto = ReportDto.ReportDtoBuilder.builder()
                        .aircraftNome(aircraft.getName())
                        .pais(pais)
                        .moeda(moeda)
                        .nomePessoa(pessoa.getNome())
                        .build();
        System.out.println(reportDto);
    }
}
