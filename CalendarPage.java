package Itfes;

import java.util.Scanner;

/**
 * Created by madoka on 2017/04/19.
 */
public class CalendarPage {
    public void dispPage(){
        System.out.println("This is Calendar Page");
        System.out.println("press allEvent(0) or myEvent(1)");
        Scanner tabMenu = new Scanner(System.in);
        int num = tabMenu.nextInt();

        switch (num){
            case 0 : //Display All Event
                //Call EventControlClass
                EventControl evCtrl = new evCtrl;
                //Display event information
                System.out.println(evCtrl.getEventInfo());
                break;
            case 1: //Display User's Event
                //Call UseControlClass
                UseControl usCtrl = new usCtrl;
                //Display event information
                System.out.println(evCtrl.getUserEventInfo());
                break;
            default:
                System.out.println("error");

        }
    }
}
