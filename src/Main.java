import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ExportConfig config1 = new ExportConfig("1.txt");
        ExportConfig config2 = new ExportConfig("2.txt");
        List<Person> list1 = new ArrayList<>();
        list1.add(new Person("ba nenae", 69, 4354367));

        Exporter exporter1 = new Exporter(config1, list1);
        Exporter exporter2 = new Exporter(config2, list1);

        exporter1.export();
        exporter2.export();
    }
}