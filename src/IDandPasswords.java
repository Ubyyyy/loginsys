import java.util.HashMap;

public class IDandPasswords {

    HashMap<String,String> logininfo = new HashMap<String,String>();

    IDandPasswords(){

        logininfo.put("Darius","motor");
        logininfo.put("Prometheus","PASSWORD");
        logininfo.put("NameCode","abc123");
    }

    protected HashMap<String, String> getLogininfo() {
        return logininfo;
    }
}
