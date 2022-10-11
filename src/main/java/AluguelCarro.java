import java.util.Date;

public class AluguelCarro {

    private String modelo;
    private String marca;
    private String placa;
    private Date ano;
    private boolean possuiGasolina;

    private String nomeLocatario;
    private String cpfLocatario;
    private int idadeLocatario;

    private Date dataInicio;
    private Date dataTermino;

    private float precoDiario;

    public AluguelCarro(){
        this.modelo = "";
        this.marca = "";
        this.placa = "";
        this.ano = new Date();
        this.possuiGasolina = false;
        this.nomeLocatario = "";
        this.cpfLocatario = "";
        this.idadeLocatario = 0;
        this.dataInicio = new Date();
        this.dataTermino = new Date();
        this.precoDiario = 0;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Date getAno() {
        return ano;
    }

    public void setAno(Date ano) {
        this.ano = ano;
    }

    public boolean isPossuiGasolina() {
        return possuiGasolina;
    }

    public void setPossuiGasolina(boolean possuiGasolina) {
        this.possuiGasolina = possuiGasolina;
    }

    public String getNomeLocatario() {
        return nomeLocatario;
    }

    public void setNomeLocatario(String nomeLocatario) {
        this.nomeLocatario = nomeLocatario;
    }

    public String getCpfLocatario() {
        return cpfLocatario;
    }

    public void setCpfLocatario(String cpfLocatario) {
        this.cpfLocatario = cpfLocatario;
    }

    public int getIdadeLocatario() {
        return idadeLocatario;
    }

    public void setIdadeLocatario(int idadeLocatario) {
        this.idadeLocatario = idadeLocatario;
    }

    public Date getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(Date dataTermino) {
        this.dataTermino = dataTermino;
    }

    public float getPrecoDiario() {
        return precoDiario;
    }

    public void setPrecoDiario(float precoDiario) {
        this.precoDiario = precoDiario;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

}
