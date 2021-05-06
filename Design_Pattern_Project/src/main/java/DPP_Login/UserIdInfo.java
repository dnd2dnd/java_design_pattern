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
public class UserIdInfo {
    private String name;
    private String id;
    private String pw;
    private String email;
    private String age;

    public UserIdInfo(String name, String id, String pw, String email, String age) {
        this.name = name;
        this.id = id;
        this.pw = pw;
        this.email = email;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    public String getPw() {
        return pw;
    }

    public String getEmail() {
        return email;
    }
    public String UserPrint(){
        String p = String.format("name:%s,id:%s, pw:%s, email:%s, age:%s",name,id,pw,email,age);
        return p;
    }
}
