package Memento;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class VersioinControl {
    private HashMap<Integer,FileSnapshot > versions=new HashMap<>();
    private static int version;

    public void addFileSnapshot(FileSnapshot fileSnapshot){
        versions.put(version, fileSnapshot);
    }

    public int getFSByVersion(){
        return versions.get(version).version;
    }

    public void listSnapshotList(){
        for(int version:versions.keySet()){
            System.out.println(version);
        }

        for(FileSnapshot fileSnapshot:versions.values()){
            fileSnapshot.getDetails();
        }
    }

    public static int getNextVersionNumber(){
        return version + 1;
    }
}
