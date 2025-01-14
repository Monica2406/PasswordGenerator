package passwordGenerator.com;
import java.security.SecureRandom;
public class PasswordGenerator {
	
	    
	    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
	    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	    private static final String DIGITS = "0123456789";
	    private static final String SPECIAL_CHARACTERS = "!@#$%^&*()-_=+<>?";

	    public static void main(String[] args) {
	        int passwordLength = 12;  // Set the length of the password
	        String password = generatePassword(passwordLength);
	        System.out.println("Generated Password: " + password);
	    }

	    public static String generatePassword(int length) {
	        StringBuilder password = new StringBuilder();
	        String allCharacters = LOWERCASE + UPPERCASE + DIGITS + SPECIAL_CHARACTERS;
	        
	        SecureRandom random = new SecureRandom();

	        for (int i = 0; i < length; i++) {
	            int index = random.nextInt(allCharacters.length());
	            password.append(allCharacters.charAt(index));
	        }

	        return password.toString();
	    }
	}



