package Itfes;

import java.util.Scanner;

/**
 * Created by madoka on 2017/04/19.
 */
abstract class DispPageClass {

    public abstract void dispPage();

    public void callMenu() {

        System.out.println("menu");
        System.out.println("choose Mypage(0),Calendar(1),PostEvent(2),MainPage(3)");
        Scanner pg = new Scanner(System.in);
        int chPage = pg.nextInt();

        switch (chPage) {
            case 0:
                break;
            case 1:
                CalendarPage cp = new CalendarPage();
                cp.dispPage();
                break;
            case 2:
                break;
            case 3:
            case 0://Jump to Mypage
                break;
            case 1://Jump to CalendarPage
                break;
            case 2://Jump to PostEventPage
                break;
            case 3://Jump to MainPage
                break;
            default:
                System.out.println("error");
        }

    }


}


