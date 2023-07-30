package exercise;


public class PasswordStrengthChecker {
    // Static method to check the strength of a password
    public static boolean isStrongPassword(String password) {
        // Password must have at least 8 characters
        if (password.length() < 8) {
            return false;
        }

        // Password must contain at least one uppercase letter
        if (!password.matches(".*[A-Z].*")) {
            return false;
        }

        // Password must contain at least one lowercase letter
        if (!password.matches(".*[a-z].*")) {
            return false;
        }

        // Password must contain at least one digit
        if (!password.matches(".*\\d.*")) {
            return false;
        }

        // Password must contain at least one special character
        if (!password.matches(".*[!@#$%^&*()].*")) {
            return false;
        }

        // Password meets all the criteria, so it is considered strong
        return true;
    }
}


