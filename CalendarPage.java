package Itfes;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by madoka on 2017/04/19.
 */
public class CalendarPage extends DispPageClass {

    public void dispPage() {

        Scanner scan = new Scanner(System.in);

        EventControlClass ecc = new EventControlClass();
        UserControlClass ucc = new UserControlClass();

        System.out.println("This is Calendar Page");
        System.out.println("press allEvent(0) or myEvent(1)");
        System.out.println("menu(99)");

        // tabMenu -> scan
        Scanner tabMenu = new Scanner(System.in);
        int num = tabMenu.nextInt();

        switch (num) {
            case 0: //Display All Event
                //Display event information
                System.out.println(Arrays.deepToString(ecc.getUpcomingEvents()));
                break;
            case 1: //Display User's Event
                //Display event information
                System.out.println(Arrays.deepToString(ucc.getUserEvent()));
                break;
            case 99://Call Menu
                this.callMenu();
                break;
            default:
                System.out.println("error");
        }

        System.out.println("Do you want to finish app? Yes(0)/No(1)");
        int finishFlg = scan.nextInt();
        if(finishFlg == 0) return;
        else{
            CalendarPage cp = new CalendarPage();
            cp.dispPage();
        }
    }
}
