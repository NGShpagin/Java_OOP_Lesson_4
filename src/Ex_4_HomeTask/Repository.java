package Ex_4_HomeTask;

import java.util.ArrayList;
import java.util.List;

public abstract class Repository <T extends Content> implements Iterable<Content> {
    List<T> ds;
    private String name;

    public Repository(String name) {
        this.ds = new ArrayList<>();
        this.name = name;
        System.out.printf("\n >> %s created\n", this.name);
    }

    public void add(T content) {
        ds.add(content);
    }

    public int count() {
        return ds.size();
    }

    public T get(Integer index) {
        return ds.get(index);
    }

    public void merge(Repository r) {
        for (var content : r) {
            ds.add((T) content);
        }
    }
}
