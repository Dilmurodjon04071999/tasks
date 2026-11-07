import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystem {
    private String name;
    private List<FileSystem> children = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(FileSystem component) {
        children.add(component);
    }

    public void remove(FileSystem component) {
        children.remove(component);
    }

    @Override
    public void show() {
        System.out.println("Folder: " + name);
        for (FileSystem component : children) {
            component.show();
        }
    }
}