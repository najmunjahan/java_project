package mainroom.loginroom;

public class LogIn {

    private String username;

    public LogIn(String username) {
        this.username = username;
    }
    
    public void loggedIn() {
        System.out.println("\nWelcome " + username + ".\n");
        System.out.println("This is a new Social Media for students. The app is under development.\nWe will release the full version of it in the next update.\nThank you for joining us!");
    }
}
