package mainroom.managementroom;

import java.io.*;
import java.util.Scanner;
import mainroom.loginroom.*;

public class SearchData implements ISearchAlgorithm {

    private String username, pass;

    public SearchData() {
        Scanner read = new Scanner(System.in);
        System.out.println("\n-------------------------\n");
        System.out.print("Your Username: ");
        username = read.nextLine();
        System.out.print("Your password: ");
        pass = read.nextLine();
    }

    public void searchUsername() {
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(new File("mainroom\\dataroom\\data.txt"));
            br = new BufferedReader(fr);
            String[] words;
            String s;
            int count = 0;
            while ((s=br.readLine())!=null) {
                words = s.split(" ");
                for (String userValue : words) {
                    if (userValue.equals(username)) {
                        ++count;
                        break;
                    }
                }
            }
            searchPassword(count);
        } catch (IOException io) {
            System.out.println("Username Searching Unsuccessful!");
        }
        finally {
            try {
                br.close();
            } catch (IOException io) {
                System.out.println("Error while closing database");
            }
        }
    }

    public void searchPassword(int count) {
        if (count == 0) {
            System.out.println("Sorry! User not found!");
        } else if (count == 1) {
            FileReader fr = null;
            BufferedReader br = null;
            try {
                fr = new FileReader(new File("mainroom\\dataroom\\data.txt"));
                br = new BufferedReader(fr);
                String[] words;
                String s;
                int pcount = 0;
                while ((s=br.readLine())!=null) {
                    words = s.split(" ");
                    for (String userValue : words) {
                        if (userValue.equals(pass)) {
                            LogIn log1 = new LogIn(username);
                            log1.loggedIn();
                            ++pcount;
                            break;
                        }
                    }
                }
                if (pcount==0) {
                    System.out.println("Sorry! Incorrect Password!");
                }
            } catch (IOException io) {
                System.out.println("Password Searching Unsuccessful!");
            }
            finally {
                try {
                    br.close();
                } catch (IOException io) {
                    System.out.println("Error while closing database!");
                }
            }
        }
    }
}
