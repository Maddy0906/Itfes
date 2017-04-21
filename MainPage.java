/**
 * Created by madoka on 2017/04/19.
 */
package Itfes;

import java.util.Arrays;
import java.util.Scanner;

public class MainPage extends DispPageClass {
    public void dispPage() {

        EventControlClass ecc = new EventControlClass();
        int num, gotoDetail;
        System.out.println("This is Main Page");

        System.out.print("press UpComing(0) or You May Like(1)");
        System.out.println("menu(99)");

        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();

        switch (num) {
            case 0: //Display upComing Event
                //Display event information
                System.out.println(Arrays.deepToString(ecc.getUpcomingEvents()));
                System.out.println("Go to event detail page(0) / No(1)");
                gotoDetail = scan.nextInt();

                if(gotoDetail == 0){
                    // go to detail page
                    EventDetailPage edp = new EventDetailPage();
                    edp.dispPage();
                }else{
                    this.dispPage();
                }
                break;

            case 1: //Display You May Like Event
                //Display event information
                System.out.println(ecc.getRecommendEvents());
                System.out.println("Go to event detail page(0) / No(1)");
                gotoDetail = scan.nextInt();

                if(gotoDetail == 0){
                    // go to detail page
                    EventDetailPage edp = new EventDetailPage();
                    edp.dispPage();
                }else{
                    this.dispPage();
                }
                break;

            case 99://Call Menu
                this.callMenu();
                break;

            default:
                System.out.println("error");

        }
    }
}
