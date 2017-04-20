package Itfes;

import java.util.Scanner;

/**
 * Created by kaorihirata on 2017-04-19.
 */
public class LoginAndRegisterPage implements Vlidate {
    public void vlidate(){};

    public void dispPage(){
        System.out.println("this is LoginAndRegisterPage");
        System.out.println("Choose and Enter sign up(0)/ sign in(1) / linkedIn(2)");

        Scanner Scan = new Scanner(System.in);
        int login = Scan.nextInt();

        switch (login) {
            case 0: // (0) sign up
                System.out.println("put name");
                String name = scan.nextLine();
                System.out.println("put Email");
                String email = scan.nextLine();
                System.out.println("put password");
                String password = scan.nextLine();
                System.out.println("put category");
                String category = scan.nextLine();

                // UserControlClassのnewRegister()を使う
                UserControlClass ucc = new UserControlClass();
                boolean uccResult = ucc.newRegister(name, email, password,category);
                if (uccResult) {
                    System.out.println("Create account successful");
                } else {
                    System.out.println("Create account fail");
                }

            case 1: // (1) sign in
                System.out.println("put Email");
                String email = scan.nextLine();
                System.out.println("put password");
                String password = scan.nextLine();

                // UserControlClassのloginBoolean()を使う
                UserControlClass userCheck = new UserControlClass();
                boolean userCheckResult = userCheck.loginBoolean(email);
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

