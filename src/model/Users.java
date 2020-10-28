package model;

public class Users {

    private Long Id;
    private String uname;
    private String pword;

    public Users(Long id, String uname, String pword) {
        Id = id;
        this.uname = uname;
        this.pword = pword;
    }

    @Override
    public String toString() {
        return "Users{" +
                "Id=" + Id +
                ", uname='" + uname + '\'' +
                ", pword='" + pword + '\'' +
                '}';
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPword() {
        return pword;
    }

    public void setPword(String pword) {
        this.pword = pword;
    }
}
