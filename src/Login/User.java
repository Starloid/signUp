package Login;

public class User {

    private String userId, password;
    static int count = 0;

    public User(String userId, String password){
        this.userId = userId;
        this.password = password;
        count++;
    }

    public void setId(String userId){
        this.userId = userId;
    }

    public String getId(){
        return this.userId;
    }

    public void setPasswd(String passwd){
        this.password = passwd;
    }

    public String getPasswd(){
        return this.password;
    }
}
