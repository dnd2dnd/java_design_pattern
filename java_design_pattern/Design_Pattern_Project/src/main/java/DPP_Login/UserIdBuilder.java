/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DPP_Login;

/**
 *
 * @author Administrator
 */
public class UserIdBuilder {
    private String name;
    private String age;
    private String id;
    private String pw;
    private String email;
    
    public UserIdBuilder(String name, String id, String pw) {
        this.name = name;
        this.id = id;
        this.pw = pw;
    }
    
    
    public UserIdBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public UserIdBuilder setAge(String age) {
        this.age = age;
        return this;
    }

    public UserIdBuilder setId(String id) {
        this.id = id;
        return this;
    }

    public UserIdBuilder setPw(String pw) {
        this.pw = pw;
        return this;
    }

    public UserIdBuilder setEmail(String email) {
        this.email = email;
        return this;
    }
    
    public UserIdInfo build(){
        UserIdInfo useridinfo = new UserIdInfo(name,id,pw,email,age);
        return useridinfo;
    }

    
    
}
