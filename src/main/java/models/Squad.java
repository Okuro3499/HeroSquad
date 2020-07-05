package models;

public class Squad {
    private int max_size;
    private String name;
    private String cause;

    public Squad(int max_size, String name, String cause) {
        this.max_size = max_size;
        this.name = name;
        this.cause = cause;
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
