package src.com.tony.config;

import java.util.Properties;

public class AppConfig {
    
    private Properties prop = null;

    public Properties getProp(){
        return this.prop;
    }

    @Resource
    private String static_string;
}
