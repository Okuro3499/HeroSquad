package models;

import java.util.ArrayList;
import java.util.List;

public class Squad {
    private int max_size;
    private String name;
    private String cause;
    private static List<Squad> instances = new ArrayList<Squad>();

    public Squad(int max_size, String name, String cause) {
        this.max_size = max_size;
        this.name = name;
        this.cause = cause;
        instances.add(this);
    }

    public static List<Squad> all() {
        return instances;
    }

    public int getMax_size() {
        return max_size;
    }

    public String getName() {
        return name;
    }

    public String getCause() {
        return cause;
    }
}
