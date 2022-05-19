package Command;

import java.util.ArrayList;
import java.util.List;

public class ServerOperatiuniBancare {
    private List<OperatiuneBancara> listaOperatiuni = new ArrayList<>();



    public void inregistreazaOperatiune(OperatiuneBancara operatiuneBancara){
        listaOperatiuni.add(operatiuneBancara);
    }

    public void efectuareOperatiuniInregistrate(){
        for(OperatiuneBancara operatiuneBancara:listaOperatiuni){
            operatiuneBancara.efectuareOperatiune();
        }
    }
}
