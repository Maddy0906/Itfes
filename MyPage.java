package Itfes;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by madoka on 2017/04/19.
 */
public class MyPage extends DispPageClass {

    public void dispPage() {

        UserControlClass ucc = new UserControlClass();

        System.out.println("This is My Page");
        System.out.println("press View profile(0) or Edit profile(1)");
        System.out.println("menu(99)");

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        switch (num) {
            case 0: //Display User data(name,E-mail,category,password)
                //Display User information
                System.out.println(Arrays.asList(ucc.getUserAccountInformation()));
                break;

            case 1: //UserDate RenewAccount()
                System.out.println("put name");
                String name = scan.nextLine();
                System.out.println("put Email");
                String email = scan.nextLine();
                System.out.println("put password");
                String password = scan.nextLine();
                System.out.println("put category");
                String category = scan.nextLine();

                boolean result = ucc.newRegister(name, email, password, category);
                if (result) {
                    // success
                    System.out.println("Renew account successful");
                    //Jump to MainPage
                } else {
                    // fail
                    System.out.println("error");
                }
                MyPage mp = new MyPage();
                mp.dispPage();
                break;

            case 99://call menu
                this.callMenu();
                break;

            default:
                System.out.println("error");

        }
    }

}
