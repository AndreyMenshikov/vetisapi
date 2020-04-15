package ru.vsdmobile.samples;

import ru.vsdmobile.Profile;

public class ProfileFactory {


	public static Profile getYourProfile() {
		Profile p = new Profile();
	    p.apiKey = "";
	    p.issuerId = "";
	    p.initiator = "";
	    p.login = "";
	    p.password = "";
	    p.useProductiveServer = false; // Или true, если надо обращаться к продктивному контуру
	    
	    return p;
	}
}
