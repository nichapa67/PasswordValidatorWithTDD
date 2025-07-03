package lib;

public class PasswordValidator {

    /**
     * คุณจะต้องเขียน Javadoc ที่สมบูรณ์ที่นี่ในอนาคต
     * เพื่ออธิบายกฎการทำงานของเมธอด
     * ใช้java
     * @param รับค่า...password string ที่ต้องการตรวจสอบเข้ามา
     * @return ส่งค่า...passwordStrenght ที่บ่งบอกความยากง่ายของการตั้งpassword
     * โดยไม่สามารถใช้passwordที่มีความยาวต่ำกว่า8ตัวอักษรได้=PasswordStrength.INVALID
     * PasswordStrength.WEAK เมื่อpasswordมีตัวอักษรพิมพ์เล็ก หรือ ตัวอักษรพิมพ์ใหญ่ หรือ ตัวเลข หรือ อักขระพิเศษ
     * PasswordStrength.MEDIUM เมื่อpasswordมีตัวอักษรพิมพ์เล็ก ตัวอักษรพิมพ์ใหญ่ และตัวเลข
     * PasswordStrength.STRONG เมื่อpasswordมีตัวอักษรพิมพ์เล็ก ตัวอักษรพิมพ์ใหญ่ ตัวเลข และอักขระพิเศษ
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
        boolean Lower = false;
        boolean Upper = false;
        boolean Digit = false;
        boolean Special = false;

        for (char c : password.toCharArray()) {
           if (Character.isLowerCase(c)) {
                Lower = true;
            } else if (Character.isUpperCase(c)) {
                Upper = true;
            } else if (Character.isDigit(c)) {
                Digit = true;
            } else {
                Special = true;
            }
        }

        if (Lower && Upper && Digit && Special) {
            return PasswordStrength.STRONG;}

        if (Lower && Upper && Digit) {
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
