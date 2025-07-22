package jp.co.rakuspartners.java.basic5;

public class Employee {

    private Integer id;
    private String name;
    private Integer age;
    private String gender;
    private Integer dapartmantID;

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getDapartmantID() {
        return dapartmantID;
    }

    public void setDapartmantID(Integer dapartmantID) {
        this.dapartmantID = dapartmantID;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", dapartmantID="
                + dapartmantID + "]";
    }

}
