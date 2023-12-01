package ExternalData;

import java.util.Base64;

public class EncryprDecrypt {
public static void main(String[] args) {
String Password = "TUVseXNpdW1AMTU0NQ==";
		 
//byte[] encrypt= Base64.getEncoder().encode(Password.getBytes());
//			
//System.out.println("Encrepted password is ="+ new String (encrypt));
			
			
byte[] decrypt = Base64.getDecoder().decode(Password);
			
System.out.println("Decrepted password is =" + new String(decrypt));
			
	}

}
