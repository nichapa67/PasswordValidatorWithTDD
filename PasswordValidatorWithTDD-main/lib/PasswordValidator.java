package lib;

public class PasswordValidator {

    /**
     * คุณจะต้องเขียน Javadoc ที่สมบูรณ์ที่นี่ในอนาคต
     * เพื่ออธิบายกฎการทำงานของเมธอด
     * @param รับค่า...password string ที่ต้องการตรวจสอบเข้ามา
     * @return ส่งค่า...ญasswordStrenght INVALID อื่นๆ
     */
    // TODO: แก้ไข return type ของเมธอดนี้ให้ถูกต้อง
    public static PasswordStrength validate(String password) { // Function Type ให้เป็น PasswordStrength 
        
        // ส่วนของ Implementation ที่คุณต้องเขียน
        // ...
        int minLength = 8 ;// TODO: มีอะไรขาดหายไปที่บรรทัดนี้?
        if (password == null || password.length() < minLength){
            return PasswordStrength.INVALID;
        }
        //แบบboolean
        boolean hasLower = false;
        boolean hasUpper = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for (char c : password.toCharArray()) {
           if (Character.isLowerCase(c)) {
                hasLower = true;
            } else if (Character.isUpperCase(c)) {
                hasUpper = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else {
                hasSpecial = true;
            }
        }

        if (hasLower && hasUpper && hasDigit && hasSpecial) {
            return PasswordStrength.STRONG;}

        if (hasLower && hasUpper && hasDigit) {
            return PasswordStrength.MEDIUM;}

        return PasswordStrength.WEAK;
    }
}
        //แบบนับค่า++
        /*int LowerCount = 0;
        int UpperCount = 0;
        int DigitCount = 0;
        int SpecialCount = 0;

        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
                LowerCount++;
            } else if (Character.isUpperCase(c)) {
                UpperCount++;
            } else if (Character.isDigit(c)) {
                DigitCount++;
            } else { 
                SpecialCount++;
            }
        }

        if (LowerCount > 0 && UpperCount > 0 && DigitCount > 0 && SpecialCount > 0) {
            return PasswordStrength.STRONG;}

        if (LowerCount > 0 && UpperCount > 0 && DigitCount > 0) {
            return PasswordStrength.MEDIUM;}

        return PasswordStrength.WEAK;
    }
}*/
