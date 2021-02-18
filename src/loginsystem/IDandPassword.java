package loginsystem;

import java.util.HashMap;

public class IDandPassword {
    HashMap<String, String> logininfo = new HashMap<String,String>();

    IDandPassword(){
        logininfo.put("name", "123");
        logininfo.put("name_1", "12345");
        logininfo.put("login", "PASSWORD");
    }

    protected HashMap getLoginInfo(){
        return logininfo;
    }
}
