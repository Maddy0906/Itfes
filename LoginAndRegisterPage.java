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
        Scanner scan = new Scanner(System.in);
        UserControlClass ucc = new UserControlClass();

        System.out.println("this is LoginAndRegisterPage");
        System.out.println("Choose and Enter sign up(0)/ sign in(1) / linkedIn(2)");
        int login = scan.nextInt();
        scan.nextLine(); // (It consumes the \n character)

        switch (login) {
            case 0: // (0) sign up
                System.out.println("put name");
                String liName = scan.nextLine();
                System.out.println("put eMail");
                String liEmail = scan.nextLine();
                System.out.println("put password");
                String liPassword = scan.nextLine();
                System.out.println("put category");
                String liCategory = scan.nextLine();

                boolean uccResult = ucc.newRegister(liName, liEmail,liPassword,liCategory);
                if (uccResult) System.out.println("Create account successful");
                else {
                    System.out.println(liName +" already exists");
                    return;
                }

                break;
            case 1: // (1) sign in
                System.out.println("put Email");
                String siEmail = scan.nextLine();
                System.out.println("put password");
                String siPassword = scan.nextLine();

                boolean userCheckResult = ucc.login(siEmail,siPassword);
                if (userCheckResult) System.out.println("Log in successful");
                else {
                    System.out.println("Log in fail");
                    return;
                }

            case 2: // (2) LinkedIn
                System.out.println("Login with LinkedIn");
        }
    }
}

