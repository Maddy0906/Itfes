/**
 * Created by madoka on 2017/04/19.
 */
package Itfes;

import java.util.Scanner;

public class MainPage {
    public void dispPage(){
        System.out.println("This is Main Page");
        System.out.println("press UpComing(0) or You May Like(1)");
        Scanner tabMenu = new Scanner(System.in);
        int num = tabMenu.nextInt();

        switch (num){
            case 0 : //Display upComing Event
                //Call EventControlClass
                EventControl evCtrl = new evCtrl;
                //Display event information
                System.out.println(evCtrl.getEventInfo());
                System.out.println("Choose Event [0]~[2]");

                break;
            case 1: //Display You May Like Event
                //Call UseControlClass
                EventControl evCtrl = new evCtrl;
                //Display event information
                System.out.println(evCtrl.getEventInfo());
                System.out.println("Choose Event [0]~[2]");
                break;
            default:
                System.out.println("error");

        }
    }
}
