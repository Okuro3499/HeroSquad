package models;

public class Squad {
    private int max_size;
    private String name;

    public Squad(int max_size, String name, String Cause) {
        this.max_size = max_size;
        this.name = name;
    }

    public int getMax_size() {
        return max_size;
    }

    public String getName() {
        return name;
    }
}
