package exceptions.Sem003;

import java.io.FileNotFoundException;

public class Task2_MyFileNotFoundException extends FileNotFoundException {

    //private final String fileName;

//    public String getFileName() {
//        return fileName;
//    }

    public Task2_MyFileNotFoundException(String s) {
        super(s);
    }

//    public Task2_MyFileNotFoundException(String s, String fileName) {
//        super(s);
//        this.fileName = fileName;
//    }
}
