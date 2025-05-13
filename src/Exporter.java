import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class Exporter {
    ExportConfig config;
    List<Person> list;
    public Exporter(ExportConfig config) {
        this.config = config;
    }
    public void setList(List<Person> list) {
        this.list = list;
    }
    public void export() {
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(config.getFileName()));
            for(Person person : list){
                writer.write(person.toString());
                writer.newLine();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
