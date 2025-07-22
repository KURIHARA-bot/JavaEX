package jp.co.rakuspartners.java.basic5;

public class dapartments {

    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "dapartments [id=" + id + ", name=" + name + "]";
    }

    


}
