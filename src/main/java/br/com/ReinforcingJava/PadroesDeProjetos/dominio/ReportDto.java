package br.com.ReinforcingJava.PadroesDeProjetos.dominio;

public class ReportDto {
    private String aircraftNome;
    private Pais pais;
    private Moeda moeda;
    protected String nomePessoa;

    @Override
    public String toString() {
        return "ReportDto{" +
                "aircraftNome='" + aircraftNome + '\'' +
                ", pais=" + pais +
                ", moeda=" + moeda +
                ", nomePessoa='" + nomePessoa + '\'' +
                '}';
    }

    public static final class ReportDtoBuilder {
        private String aircraftNome;
        private Pais pais;
        private Moeda moeda;
        private String nomePessoa;

        private ReportDtoBuilder() {
        }

        public static ReportDtoBuilder builder() {
            return new ReportDtoBuilder();
        }

        public ReportDtoBuilder aircraftNome(String aircraftNome) {
            this.aircraftNome = aircraftNome;
            return this;
        }

        public ReportDtoBuilder pais(Pais pais) {
            this.pais = pais;
            return this;
        }

        public ReportDtoBuilder moeda(Moeda moeda) {
            this.moeda = moeda;
            return this;
        }

        public ReportDtoBuilder nomePessoa(String nomePessoa) {
            this.nomePessoa = nomePessoa;
            return this;
        }

        public ReportDto build() {
            ReportDto reportDto = new ReportDto();
            reportDto.pais = this.pais;
            reportDto.nomePessoa = this.nomePessoa;
            reportDto.aircraftNome = this.aircraftNome;
            reportDto.moeda = this.moeda;
            return reportDto;
        }

        public String getAircraftNome() {
            return aircraftNome;
        }
    }
}
