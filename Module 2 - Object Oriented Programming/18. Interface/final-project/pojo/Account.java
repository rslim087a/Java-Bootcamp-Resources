package pojo;

public abstract class Account {

    private String id;

    public Account(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public abstract Account clone();

}
