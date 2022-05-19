package Command;

public class AlimentareCont implements OperatiuneBancara{
    private String cont;
    private Double suma;

    public AlimentareCont(String cont, Double suma) {
        this.cont = cont;
        this.suma = suma;
    }


    @Override
    public void efectuareOperatiune() {
        System.out.println("Operatiunea de alimentare cont " + cont+ " cu suma de " + suma + " s-a efectuat cu succes!");
    }
}
