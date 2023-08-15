package br.com.ReinforcingJava.PadroesDeProjetos.teste;


import br.com.ReinforcingJava.PadroesDeProjetos.dominio.*;

public class DtoTeste {
    public static void main(String[] args) {

        Aircraft aircraft = new Aircraft("777");
        Pais pais = Pais.BRAZIL;
        Moeda moeda = MoedaFactory.novaMoeda(pais);
        Pessoa pessoa = Pessoa.PessoaBuilder.builder().nome("Lucas")
                .sobrenome("Ramon").build();


        ReportDto reportDto = ReportDto.ReportDtoBuilder.builder()
                .aircraftNome(aircraft.getName())
                .pais(pais)
                .moeda(moeda)
                .nomePessoa(pessoa.getNome())
                .build();

        System.out.println(reportDto);
    }
}
