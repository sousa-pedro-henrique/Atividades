public class Consultoria implements Tributavel{
    private double valor;
    private String descricao;

    public Consultoria (String descricao, double valor){
        this.descricao=descricao;
        this.valor=valor;
    }

    @Override
    public String getTipoImposto() {
        return "ISS";
    }

    @Override
    public double getAliquota() {
        return 0.15;
    }

    @Override
    public double getValorImposto() {
        return getValor()*getAliquota();
    }

    public double getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }
}
