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
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                System.out.println("error");
        }

    }


}


