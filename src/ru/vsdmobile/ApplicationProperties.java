package ru.vsdmobile;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ApplicationProperties {
    
    //main
    public final static String SITE_URL = "site.url";
    public final static String SERVER_URL_HTTP = "server.url.http";
    public final static String SERVER_URL_HTTPS = "server.url.https";
    public final static String EXCEL_TEMP_DIR = "excel.temp.dir";
    public final static String DATAPACK_DIR = "datapack.dir";
    public final static String UPLOAD_TEMP_DIR = "upload.temp.dir";
    public final static String ECLIPSELINK_LOGFILE = "eclipselink.logfile";
	
    
    private static ApplicationProperties instance;
    
    private static ApplicationProperties getInstance(){
    	if(instance == null){
    		instance = new ApplicationProperties();
    	}
    	return instance;
    }
	
    public ApplicationProperties() {
        reloadProperties();
    }
    
    
    private Properties props;
    
    public static String get(final String key){
    	return getInstance().get_(key);
    }
    
    private String get_(final String key) {
        return props.getProperty(key);
    }
    
    public static void reload(){
    	getInstance().reloadProperties();
    }
    
    private void reloadProperties() {
        try {
	    	props = new Properties();
	    	String propFileName = "production.properties"; 
	    	InputStream stream = getClass().getClassLoader().getResourceAsStream(propFileName);
	    	props.load(stream);
        } catch (final IOException e) {
            e.printStackTrace();
        }
    }
}
