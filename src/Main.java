import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ExportConfig config1 = new ExportConfig("1.txt");
        Exporter exporter1 = new Exporter(config1);

        ExportConfig config2 = new ExportConfig();
        Exporter exporter2 = new Exporter(config2);

        List<Person> list1 = new ArrayList<>();
        list1.add(new Person("nenea", 33, 23534646));

        exporter1.setList(list1);
        exporter2.setList(list1);
        exporter1.export();
        exporter2.export();
    }
}