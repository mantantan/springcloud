package yonyou.esn.entity;

/**
 * Created by mantantan on 2018/2/4.
 */
public class User {
    private String id;
    private String name;
    private String gender;

    public User(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
