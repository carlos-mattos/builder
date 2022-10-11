import java.lang.reflect.Field;
import java.util.Date;
import java.util.Objects;

public class AluguelCarroBuilder {

    private AluguelCarro aluguelCarro;

    public AluguelCarroBuilder(){
        aluguelCarro = new AluguelCarro();
    }

    public AluguelCarro build() {
        if (aluguelCarro.getModelo().equals("")) {
            throw new IllegalArgumentException("Campo obrigatorio - Modelo");
        }

        if (aluguelCarro.getMarca().equals("")) {
            throw new IllegalArgumentException("Campo obrigatorio - Marca");
        }

        if (aluguelCarro.getPlaca().equals("")) {
            throw new IllegalArgumentException("Campo obrigatorio - Placa");
        }

        if (aluguelCarro.getNomeLocatario().equals("")) {
            throw new IllegalArgumentException("Campo obrigatorio - Nome Locatario");
        }

        if (aluguelCarro.getCpfLocatario().equals("")) {
            throw new IllegalArgumentException("Campo obrigatorio - CPF Locatario");
        }

        if (aluguelCarro.getIdadeLocatario() == 0) {
            throw new IllegalArgumentException("Campo obrigatorio - Idade Locatario");
        }

        if (aluguelCarro.getIdadeLocatario() < 18 ) {
            throw new IllegalArgumentException("Idade minima de 18 anos");
        }

        if (aluguelCarro.getPrecoDiario() == 0 ) {
            throw new IllegalArgumentException("Campo obrigatorio - Preco diario");
        }

        if(aluguelCarro.getDataTermino().before(aluguelCarro.getDataInicio())){
            throw new IllegalArgumentException("Data termino anterior a data inicio");
        }

        return aluguelCarro;
    }

    public AluguelCarroBuilder setModelo(String modelo) {
        this.aluguelCarro.setModelo(modelo);
        return this;
    }

    public AluguelCarroBuilder setMarca(String marca) {
        this.aluguelCarro.setMarca(marca);
        return this;
    }

    public AluguelCarroBuilder setPlaca(String placa) {
        this.aluguelCarro.setPlaca(placa);
        return this;
    }

    public AluguelCarroBuilder setAno(Date ano) {
        this.aluguelCarro.setAno(ano);
        return this;
    }

    public AluguelCarroBuilder setPossuiGasolina(boolean possuiGasolina) {
        this.aluguelCarro.setPossuiGasolina(possuiGasolina);
        return this;
    }

    public AluguelCarroBuilder setNomeLocatario(String nomeLocatario) {
        this.aluguelCarro.setNomeLocatario(nomeLocatario);
        return this;
    }

    public AluguelCarroBuilder setCpfLocatario(String cpfLocatario) {
        this.aluguelCarro.setCpfLocatario(cpfLocatario);
        return this;
    }

    public AluguelCarroBuilder setIdadeLocatario(int idadeLocatario) {
        this.aluguelCarro.setIdadeLocatario(idadeLocatario);
        return this;
    }

    public AluguelCarroBuilder setDataTermino(Date dataTermino) {
        this.aluguelCarro.setDataTermino(dataTermino);
        return this;
    }

    public AluguelCarroBuilder setPrecoDiario(float precoDiario) {
        this.aluguelCarro.setPrecoDiario(precoDiario);
        return this;
    }

}
