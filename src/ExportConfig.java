public class ExportConfig {
    String fileName;

    public ExportConfig() {}

    public ExportConfig(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }
    public void setFilename(String filename) {
        this.fileName = filename;
    }
}
