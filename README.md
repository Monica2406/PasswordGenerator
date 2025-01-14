# PasswordGenerator
Overview
The Password Generator is a simple Java application that generates random and secure passwords containing a mix of lowercase letters, uppercase letters, digits, and special characters. The password length is customizable, and the program ensures the generated password has sufficient entropy for security purposes.
 Features
Generates random passwords with a combination of lowercase letters, uppercase letters, digits, and special characters.
The length of the generated password can be adjusted as per the requirement.
Uses Java's `SecureRandom` for cryptographically strong random number generation.
Provides a secure way to create passwords for applications and systems.
 Requirements
Java 8 or later
How to Use
1. Clone or download the repository.
2. Compile the `PasswordGenerator.java` file.
3. Run the program, and it will output a randomly generated password of length 12 by default. You can modify the `passwordLength` variable in the code to change the length of the password.
4. The password will consist of:
   - Lowercase letters (`a-z`)
   - Uppercase letters (`A-Z`)
   - Digits (`0-9`)
   - Special characters (`!@#$%^&*()-_=+<>?`)
