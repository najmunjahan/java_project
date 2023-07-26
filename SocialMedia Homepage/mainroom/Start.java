//This is a simple code of creating new account and logging with existing account.

package mainroom;

import java.util.Scanner;
import mainroom.managementroom.*;
import mainroom.dataroom.*;
import mainroom.textsroom.*;

public class Start {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int quit = 0;

        while (quit!=1) {
            quit = 0;
            int option = 0;
            Message msg = new Homepage();
            msg.message();

            try {
                option = read.nextInt();
            } catch (Exception e) {
                msg.errorMessage();
            }
            read.nextLine();

            switch(option) {
                case 1: 
                    Database db = new Database();
                    db.setData();
                    break;
                case 2:
                    SearchData sd = new SearchData();
                    sd.searchUsername();
                    break;
                default:
                    System.out.println("Invalid option!");
            }
            quit = ExitProgram.exit();
        }

        System.out.println("\n***** Thank you for your time! *****");
    }
}

