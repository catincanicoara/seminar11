package Command;

public class Main {
    public static void main(String[] args) {
        //instantiere multipla de obiecte de tip operatiuni bancare
        Plata plata1 = new Plata(100, "Cont1");
        AlimentareCont alimentareCont = new AlimentareCont("Cont2", 300.0);
        Plata plata2 = new Plata(200, "Cont3");
        AlimentareCont alimentareCont1 = new AlimentareCont("Cont4", 600.0);

        ServerOperatiuniBancare listaOperatiuni = new ServerOperatiuniBancare();
        listaOperatiuni.inregistreazaOperatiune(plata1);
        listaOperatiuni.inregistreazaOperatiune(alimentareCont);
        listaOperatiuni.inregistreazaOperatiune(plata2);
        listaOperatiuni.inregistreazaOperatiune(alimentareCont1);

        listaOperatiuni.efectuareOperatiuniInregistrate();
    }


//    ServerOperatiuniBancare listaOperatiuni = new ServerOperatiuniBancare().inregistreazaOperatiune(plata1).inregistreazaOperatiune(alimentareCont).inregistreazaOperatiune(plata2).inregistreazaOperatiune(alimentareCont1).efectuareOperatiuniInregistrate();
    //efectuare operatiuni
}
