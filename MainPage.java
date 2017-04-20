/**
 * Created by madoka on 2017/04/19.
 */
package Itfes;

import java.util.Scanner;

public class MainPage extends DispPageClass {
    public void dispPage() {
        System.out.println("This is Main Page");

        System.out.println("press UpComing(0) or You May Like(1)");
        System.out.println("menu(99)");

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        switch (num) {
            case 0: //Display upComing Event
                //Call EventControlClass
                EventControlClass evCtrl = new EventControlClass();
                //Display event information
                System.out.println(evCtrl.getEventInfo());

                //Ask join a event
                System.out.println("Join(0) or Not(1)");
                int join = scan.nextInt();
                switch (join) {
                    case 0://Join
                        //Set event UserControlClass
                        UserControlClass event = new UserControlClass();
                        break;
                    case 1:
                        break;
                }

                System.out.println("Choose Event [0]~[2]");
                //Jump to each EventDetailPage
                break;

            case 1: //Display You May Like Event
                //Call UseControlClass
                EventControlClass evCtrl = new EventControlClass();
                //Display event information
                System.out.println(evCtrl.getEventInfo());

                //Ask join a event
                System.out.println("Join(0) or Not(1)");
                int join02 = scan.nextInt();
                switch (join02) {
                    case 0://Join
                        //Set event UserControlClass
                        UserControlClass event = new UserControlClass();
                        break;
                    case 1:
                        break;
                }

                System.out.println("Choose Event [0]~[2]");
                //Jump to each EventDetailPage
                break;

            case 99://Call Menu
                this.callMenu();
                break;

            default:
                System.out.println("error");

        }
    }
}
