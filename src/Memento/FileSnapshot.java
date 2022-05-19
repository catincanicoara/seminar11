package Memento;

public class FileSnapshot {
    String content;
    int version;
    String dateTime;
    String message;

    public FileSnapshot(String content, int version, String dateTime, String message) {
        this.content = content;
        this.version = version;
        this.dateTime = dateTime;
        this.message = message;
    }

    public String getContent() {
        return content;
    }

    public String getDetails(){
        return version + dateTime + message;
    }
}
