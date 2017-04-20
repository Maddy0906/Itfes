package Itfes;

import java.util.Scanner;

/**
 * Created by madoka on 2017/04/19.
 */
public class MyPage extends DispPageClass {
    //check mail adress char
    public static final String MATCH_MAIL =
            "([a-zA-Z0-9][a-zA-Z0-9_.+\\-]*)@(([a-zA-Z0-9][a-zA-Z0-9_\\-]+\\.)+[a-zA-Z]{2,6})";

    public void dispPage() {
        System.out.println("This is My Page");
        System.out.println("press View profile(0) or Edit profile(1)");
        System.out.println("menu(99)");

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        switch (num) {
            case 0: //Display User data(name,E-mail,category,password)
                //Call UseControlClass
                UserControlClass usCtrl = new UserControlClass();
                //Display User information
                System.out.println(usCtrl.getUserDate());
                break;

            case 1: //UserDate RenewAccount()
                System.out.println("put name");
                String name = scan.nextLine();
                System.out.println("put Email");
                String email = scan.nextLine();

                System.out.println("put password");
                String password = scan.nextLine();
                //check mail adress
                if (email.matches(MATCH_MAIL)) {
                    System.out.println("okay");
                } else {
                    System.out.println("error");
                }

                //Use UserControlClass RenewAccount()
                UserControlClass ucc = new UserControlClass();
                boolean result = ucc.newRegister(name, email, password);
                if (result) {
                    // success
                    System.out.println("Renew account successful");
                    //Jump to MainPage
                } else {
                    // fail
                    System.out.println("error");
                }
                break;

            case 99://call menu
                this.callMenu();
                break;

            default:
                System.out.println("error");

        }
    }

}
