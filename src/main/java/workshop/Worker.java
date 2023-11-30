
package workshop;

public class Worker {
    public static void main(String[] args) {
        Tool[] tools = {new Tool("Mlotek"), new Tool("Srobokrent"), new Tool("Drabina")};

        for (Tool tool : tools) {
            tool.useTool();
        }
    }
}