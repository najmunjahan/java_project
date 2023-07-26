package mainroom.textsroom;

public class Homepage extends Message {

    public void message() {
        System.out.println("\n*************************");
        System.out.println("Welcom to MySocialMedia!");
        System.out.println("*************************\n");
        System.out.println("Homepage\n");
        System.out.println("1. Create a new account.");
        System.out.println("2. Log in with existing account.\n");
        System.out.print("Insert any option: ");
    }
    
    public void errorMessage() {
        System.out.println("Please insert accurate option (insert option number.)");
    }
}
