package lib;

public class PasswordValidatorTest{
    
    public static void run() {
        System.out.println("--- Running Password Validator Tests ---\n");
        
        // Test Case 1: รหัสผ่านสั้นควรจะ INVALID
        String pw1="123";
        PasswordStrength result1 = PasswordValidator.validate(pw1);
        if (result1 == PasswordStrength.INVALID) {
            System.out.println("Test Case 1 : "+pw1+" \nPassed : Short password is INVALID.\n");
        } else {
            System.out.println("Test Case 1 : "+pw1+" \nFAILED: Expected INVALID but got " + result1+"\n");
        }

        // --- เขียน Test Case อื่นๆ ต่อ ---
        // Test Case 2: รหัสผ่านสั้นควรจะ WEAK
        String pw2="abcdefgh";
        //String pw2="************";
        //String pw2="abcdefghi"; 9ตัว
        //String pw2="Abcdefghi"; up
        //String pw2="Abcdefgh1"; digit
        //String pw2="bcdefghi*"; spe
        PasswordStrength result2 = PasswordValidator.validate(pw2);
        if (result2 == PasswordStrength.WEAK) {
            System.out.println("Test Case 2 : "+pw2+" \nPassed : Short password is WEAK.\n");
        } else {
            System.out.println("Test Case 2 : "+pw2+" \nFAILED: Expected WEAK but got " + result2+"\n");
        }

        // Test Case 3: รหัสผ่านสั้นควรจะ MEDIUM
        String pw3="Abcdefgh1";
        PasswordStrength result3 = PasswordValidator.validate(pw3);
        if (result3 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 3 : "+pw3+" \nPassed : Short password is MEDIUM.\n");
        } else {
            System.out.println("Test Case 3 : "+pw3+" \nFAILED: Expected MEDIUM but got " + result3+"\n");
        }

        // Test Case 4: รหัสผ่านสั้นควรจะ STRONG
        String pw4="AbcdefgH_67";
        //String pw4="AbH_67";
        PasswordStrength result4 = PasswordValidator.validate(pw4);
        if (result4 == PasswordStrength.STRONG) {
            System.out.println("Test Case 4 : "+pw4+" \nPassed : Short password is STRONG.\n");
        } else {
            System.out.println("Test Case 4 : "+pw4+" \nFAILED: Expected STRONG but got " + result4+"\n");
        }

        System.out.println("--------------------------------");
    }
}
