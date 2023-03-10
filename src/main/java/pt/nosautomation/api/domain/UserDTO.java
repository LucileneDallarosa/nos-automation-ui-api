package pt.nosautomation.api.domain;

public class UserDTO extends PeopleDTO {

    private int id;
    private String email;
    private String status;

    public UserDTO(String name, String gender) {
        super(name, gender);
    }

    public UserDTO(String name, String email, String gender, String status) {
        super(name, gender);
        this.email = email;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
