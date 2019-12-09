package list;

import java.io.UnsupportedEncodingException;
import java.util.Base64.Encoder;

public class Base64 {
	
	public static void main(String args[]) throws UnsupportedEncodingException {
		Encoder encoder = java.util.Base64.getEncoder();
		String txt = "1";
		byte[] byteTxt = txt.getBytes("UTF-8");
		
		System.out.println(encoder.encodeToString(byteTxt));
	}

}
