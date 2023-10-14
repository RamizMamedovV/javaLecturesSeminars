package sem6_homework;

import java.io.FileWriter;
import java.io.IOException;

public class SaveOrderToJson {

    private final Order order;

    private String fileName;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public SaveOrderToJson(Order order, String file) {
        this.order = order;
        this.fileName = file;
    }

    public void saveTo() {
        try (FileWriter writer = new FileWriter(fileName + ".json", false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\""+ order.getClientName() + "\",\n");
            writer.write("\"product\":\""+ order.getProduct() +"\",\n");
            writer.write("\"qnt\":"+ order.getQnt() +",\n");
            writer.write("\"price\":"+ order.getPrice() +"\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
