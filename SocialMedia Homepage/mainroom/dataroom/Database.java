package mainroom.dataroom;

import java.io.*;
import java.util.Scanner;

public class Database {

    private String[] datas = new String[3];

    public Database() {
        Scanner read = new Scanner(System.in);
        System.out.println("\n-------------------------\n");
        System.out.println("Give required informaiton.");
        System.out.print("Name: ");
        datas[0] = read.nextLine();
        System.out.print("Username: ");
        datas[1] = read.nextLine();
        System.out.print("Set Password: ");
        datas[2] = read.nextLine();
    }

    public void setData() {
        Scanner read = new Scanner(System.in);
        File f = new File("mainroom\\dataroom\\data.txt");
        try {
            f.createNewFile();
        } catch (IOException io) {
            System.out.println("Error while creating database!");
        }
        //int in = 0;
        FileWriter fw = null;
        try {
            fw = new FileWriter(f, true);
            for (int i=0; i<3; i++) {
                if (i==0) {
                    fw.write("Name: " + datas[i] + "\n");
                } else if (i==1) {
                    fw.write("Username: " + datas[i] + "\n");
                } else if (i==2) {
                    fw.write("Password: " + datas[i] + "\n");
                }
            }
            System.out.println("\nData is saved in the database successfully!");
            /*System.out.println("press 1");
            in = read.nextInt();*/
        } catch (IOException io) {
            System.out.println("Unsuccessful Data Saving in Database");
        }
        finally {
            try {
                fw.close();
            } catch (IOException io) {
                System.out.println("Error while closing database!");
            }
        }
    }
}