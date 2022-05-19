package Memento;

public class File {
    //content:string
    //id:string
    //adress:string
    //name:string

    private String content;
    private String id;
    private String adress;
    private String name;

    //constructor cu toti parametrii
    public File(String content, String id, String adress, String name) {
        this.content = content;
        this.id = id;
        this.adress = adress;
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String print(){
        return content;
    }

    public FileSnapshot createFileSnapshot(String message){
        FileSnapshot fileSnapshot = new FileSnapshot(content, VersioinControl.getNextVersionNumber(), "Data1",message);
        return fileSnapshot;
    }

    public FileSnapshot restoreToSomePoint(FileSnapshot fileSnapshot){
        return fileSnapshot;
    }

}
