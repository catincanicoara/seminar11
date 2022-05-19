package Command;

public class Plata implements OperatiuneBancara{
    private double suma;
    private String contDestinatie;

    public Plata(double suma, String contDestinatie) {
        this.suma = suma;
        this.contDestinatie = contDestinatie;
    }

    @Override
    public void efectuareOperatiune() {
        System.out.println("Operatiunea de plata cu suma de " + suma + " din contul de destinatie " + contDestinatie+ " este efectuata cu succes!");
    }
}
