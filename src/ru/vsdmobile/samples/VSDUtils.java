package ru.vsdmobile.samples;

import java.util.Random;

public class VSDUtils {

	public static enum RTYPE{CHAR, NUMBER, BOTH}

	public static String genRnd(RTYPE type, int length) {
		String candidateChars = null;
		switch(type) {
		case NUMBER:
			candidateChars = "1234567890"; 
			break;
		case CHAR:
			candidateChars = "АВЕКМНОРСТХ"; 
			break;
		default:
			candidateChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890"; 
		}
	    StringBuilder sb = new StringBuilder();
	    for (int i = 0; i < length; i++) {
	        sb.append(candidateChars.charAt(new Random().nextInt(candidateChars
	                .length())));
	    }
	
	    return sb.toString();
	}

}
