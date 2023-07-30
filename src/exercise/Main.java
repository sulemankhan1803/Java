package exercise;

public class Main {
    public static void main(String[] args) {
        String password1 = "StrongP@ssword123";
        String password2 = "WeakPwd";
        String password3 = "AnotherWeakPassword";

        // Check password strengths using the PasswordStrengthChecker class
        System.out.println("Is password1 strong? " + PasswordStrengthChecker.isStrongPassword(password1));
        System.out.println("Is password2 strong? " + PasswordStrengthChecker.isStrongPassword(password2));
        System.out.println("Is password3 strong? " + PasswordStrengthChecker.isStrongPassword(password3));
    }
}
