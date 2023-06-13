
package model;

import java.io.FileWriter;
import java.io.IOException;

public class FileOperation implements FileOperationlmpl {
    @Override
    public void dataSave(String line, String file) {
        try (FileWriter fw = new FileWriter(file, true)){
            fw.write(line+"\n");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}