package Itfes;

import java.util.Scanner;

/**
 * Created by kaorihirata on 2017-04-19.
 */
public class LoginAndRegisterPage implements Validate {
    @Override
    public void validate() {

    }

    public void dispPage(){
        System.out.println("this is LoginAndRegisterPage");
        System.out.println("Choose and Enter sign up(0)/ sign in(1) / linkedIn(2)");

        Scanner scan = new Scanner(System.in);
        int login = scan.nextInt();

        switch (login) {
            case 0: // (0) sign up
                System.out.println("put name");
                String liName = scan.nextLine();
                System.out.println("put Email");
                String liEmail = scan.nextLine();
                System.out.println("put password");
                String liPassword = scan.nextLine();
                System.out.println("put category");
                String liCategory = scan.nextLine();

                // UserControlClassのnewRegister()を使う
                UserControlClass ucc = new UserControlClass();
                boolean uccResult = ucc.newRegister(liName, liEmail,liPassword,liCategory);
                if (uccResult) {
                    System.out.println("Create account successful");
                } else {
                    System.out.println("Create account fail");
                }

            case 1: // (1) sign in
                System.out.println("put Email");
                String siEmail = scan.nextLine();
                System.out.println("put password");
                String siPassword = scan.nextLine();

                // UserControlClassのloginBoolean()を使う
                UserControlClass userCheck = new UserControlClass();
                boolean userCheckResult = userCheck.loginBoolean(siEmail,siPassword);
                if (userCheckResult) {
                    System.out.println("Log in successful");
                } else {
                    System.out.println("Log in fail");
                }
            case 2: // (2) LinkedIn
                System.out.println("Login with LinkedIn");
        }
    }
}

