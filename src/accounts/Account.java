package accounts;

public class Account {
    private int id;
    private String username;
    private String passwork;
    private String phone;
    private String birthday;

    public Account() {
    }

    public Account(int id, String username, String passwork, String phone, String birthday) {
        this.id = id;
        this.username = username;
        this.passwork = passwork;
        this.phone = phone;
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswork() {
        return passwork;
    }

    public void setPasswork(String passwork) {
        this.passwork = passwork;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "account{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", passwork='" + passwork + '\'' +
                ", phone='" + phone + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
