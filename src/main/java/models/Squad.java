package models;

public class Squad {
    private int max_size;

    public Squad(int max_size, String name, String Cause) {
        this.max_size = max_size;
    }

    public int getMax_size() {
        return max_size;
    }
}
