package dio.web.api.model;

public class Usuario {
    private Integer Id;
    private String login;
    private String password;
    public Usuario() {}
    public Usuario(String login, String password) {
        this.login = login;
        this.password = password;
    }
    @Override
    public String toString() {
        return "User{" + 
               "login='"+ login +'\'' +
               ", passoword='"+ password +'\'' + 
                '}';
    }
    public Integer getId() {
        return Id;
    }
    public void setId(Integer id) {
        Id = id;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    

}
