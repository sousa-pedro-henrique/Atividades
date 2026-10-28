import javax.swing.*;

public class AppTributos {
    public static void main(String[] args){

        CalculaTributo lista = new CalculaTributo();

    int menu = 1;
        while(menu !=0) {
            menu = Integer.parseInt(JOptionPane.showInputDialog(null, "[1] Consultoria\n[2] Imovel\n[3] Autonomo\n[4] Calcular total\n[0] Sair"));

            switch (menu){
                case 1:{
                    double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor da Consultoria:"));
                    String descricao = JOptionPane.showInputDialog(null, "Descriçao:");

                    lista.adicinar(new Consultoria(descricao, valor));

                    break;
                }case 2:{
                    double Valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor do Imovel:"));
                    double Tamanho= Double.parseDouble(JOptionPane.showInputDialog(null, "Tamanho do Imovel:"));
                    String Endereco = JOptionPane.showInputDialog(null, "Endereço:");

                    lista.adicinar(new Imovel(Valor, Tamanho, Endereco));

                    break;
                }case 3:{

                    String Nome = JOptionPane.showInputDialog(null, "Nome do Trabalhador Autonomo:");
                    String CPF = JOptionPane.showInputDialog(null, "CPF do Trabalhador:");
                    String Endereco = JOptionPane.showInputDialog(null, "Endereço do Ttrabalhador:");
                    double Remuneracao = Double.parseDouble(JOptionPane.showInputDialog(null, "Valor da Remuneraçao:"));

                    lista.adicinar(new Autonomo(Nome, CPF, Endereco, Remuneracao));

                    break;
                } case 4:{

                    JOptionPane.showMessageDialog(null, "Total: " + lista.CalcularTotal());

                   break;
                } default: break;

            }
        }
    }
}

