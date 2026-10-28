public class Imovel implements Tributavel{
    private double Valor;
    private double Tamanho;
    private String Endereco;

    public Imovel(double valor, double tamanho, String endereco){
        this. Valor = valor;
        this.Endereco = endereco;
        this.Tamanho = tamanho;
    }

    public double getValor() {
        return Valor;
    }

    public double getTamanho() {
        return Tamanho;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setValor(double valor) {
        Valor = valor;
    }

    @Override
    public String getTipoImposto() {
        return "IPTU";
    }

    @Override
    public double getAliquota() {
        return 0.01;
    }

    @Override
    public double getValorImposto() {
        return getValor() * getAliquota();
    }
}