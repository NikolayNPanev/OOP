public class User {
    ////////////////////////
    // USER ACCESS VALUES //
    ////////////////////////
    enum UserAccess{
        Client,
        Admin,
        Courier
    }
    ////////////////////
    // PRIVATE FIELDS //
    ////////////////////
    private String name;
    private String uid;
    private UserAccess access;
    private String password;
    private String email;

    //////////////////
    // CONSTRUCTORS //
    //////////////////
    public User(String name, String uid, String password, String email, UserAccess access) {
        this.name = name;
        this.uid = uid;
        this.access = access;
        this.password = password;
        this.email = email;
    }
    public User(String name, String uid, String password, String email) {
        this.name = name;
        this.uid = uid;
        this.access = UserAccess.Client;
        this.password = password;
        this.email = email;
    }

    ////////////////////
    // BUSINESS LOGIC //
    ////////////////////


    /////////////////////////
    // GETTERS AND SETTERS //
    /////////////////////////

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public UserAccess getAccess() {
        return access;
    }

    public void setAccess(UserAccess access) {
        this.access = access;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
