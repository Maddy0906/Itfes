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
        scan.nextLine();

        switch (num) {
            case 0: //Display User data(name,E-mail,category,password)
                //Display User information
                System.out.println(Arrays.asList(ucc.getUserAccount()));
                System.out.println("---Your Event list---");
                String[][] userEvents = ucc.getUserEvent();
                if(userEvents[0][0] == null){
                    System.out.println("Nothing to join your events");
                } else {
                    for(int i=0;i<userEvents.length;i++){
                        if(userEvents[i][0] == null) continue;
                        System.out.println(Arrays.deepToString(userEvents));
                    }
                }
                this.dispPage();
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
                } else {
                    // fail
                    System.out.println("error");
                }
                this.dispPage();
                break;

            case 99://call menu
                this.callMenu();
                break;

            default:
                System.out.println("error");

        }
    }

}
