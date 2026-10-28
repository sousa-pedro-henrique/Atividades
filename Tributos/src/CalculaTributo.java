import java.util.ArrayList;
import java.util.List;

public class CalculaTributo {

    List<Tributavel> Tributaveis = new ArrayList<Tributavel>();

    public void adicinar(Tributavel t){
        Tributaveis.add(t);
    }

    public double CalcularTotal(){
        double total=0;
            for(Tributavel t : Tributaveis){
                total+= t.getValorImposto();
            }
        return total;
    }
}