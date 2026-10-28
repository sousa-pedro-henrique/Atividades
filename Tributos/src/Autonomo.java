public class Autonomo implements Tributavel{

    private String Nome;
    private String CPF;
    private String Endereco;
    private double Remuneracao;

    public Autonomo(String nome, String cpf,String endereco, double salario){
        Nome = nome;
        CPF = cpf;
        Endereco = endereco;
        Remuneracao = salario;
    }

    public void setRemuneracao(double salario){
        Remuneracao = salario;
    }
    public String getNome(){
        return Nome;
    }
    public String getCPF(){
        return CPF;
    }
    public String getEndereco(){
        return Endereco;
    }
    public double getRemuneracao(){
        return Remuneracao;
    }

    @Override
    public String getTipoImposto() {
        return "INSS";
    }

    @Override
    public double getAliquota() {
        return 0.11;
    }

    @Override
    public double getValorImposto() {
        if(Remuneracao * getAliquota() < 8157.41 * 0.11){
            return Remuneracao * getAliquota();
        }else return  8157.41 * 0.11;
    }
}

