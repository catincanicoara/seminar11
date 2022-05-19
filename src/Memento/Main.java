package Memento;

public class Main {
    //instantiere obiect file
    public static void main(String[] args) {
        File file = new File("continut", "1","adresa1", "nume1");
        VersioinControl versioinControl = new VersioinControl();
        FileSnapshot fileSnapshot=file.createFileSnapshot("commit");
        System.out.println(file);
        System.out.println(fileSnapshot.getDetails());
        file.setContent("contentNou");
        versioinControl.addFileSnapshot(fileSnapshot);
        FileSnapshot fileSnapshot1 = file.createFileSnapshot("rollback");
        System.out.println(file.print());
        System.out.println(fileSnapshot1.getDetails());

        versioinControl.addFileSnapshot(fileSnapshot1);
        file.restoreToSomePoint(fileSnapshot);
        System.out.println(file.print());

        versioinControl.listSnapshotList();
    }


    //salvare snapshot

    //editare fisier
    //salvare
    //editae
    //print
    //listare snapshot
    //restoreTo...
    //printRestoredFile
}
