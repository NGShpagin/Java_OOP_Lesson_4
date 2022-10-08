package Ex_4_HomeTask;

import java.util.Iterator;

public class Repos extends Repository {


    public Repos(String name) {
        super(name);
    }

    @Override
    public Iterator<Content> iterator() {

        Iterator<Content> con = new Iterator<Content>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < ds.size();
            }

            @Override
            public Content next() {
                return (Content) ds.get(index++);
            }

        };
        return con;
    }
}
