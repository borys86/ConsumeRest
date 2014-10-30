package hello;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Page {

    private String id;
    private String password;
    
    public String getId() {
        return id;
    }
    
    public String getPassword() {
        return password;
    }   
}

