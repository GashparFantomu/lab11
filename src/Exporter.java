import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exporter {
    ExportConfig config;
    List<Person> list;
    public Exporter(ExportConfig config, List<Person> list) {
        this.config = config;
        this.list = List.copyOf(list);
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
    public ExportConfig getConfig() {
        return config;
    }
    public List<Person> getList() {
        return Collections.unmodifiableList(list);
    }
}//si sa facem exporterul in builder
