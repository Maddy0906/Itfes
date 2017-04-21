package Itfes;

import java.util.Arrays;
import java.util.Scanner;

public class EventDetailPage extends DispPageClass {

    public void dispPage(){
        EventControlClass ecc = new EventControlClass();

        System.out.println("this is EventDetailPage");
        System.out.println("Choose one of this EventDetail(0)/menu(99)");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        switch (num) {
            case 0: // (0)show EventDetail
                // EventControlClassからデータ取得
                System.out.println(Arrays.asList(ecc.getEventDetail(1)));

                this.chJoin();

            case 99://Call Menu
                this.callMenu();
                break;
            default:
                System.out.println("error");
        }
    }

    public void chJoin(){
        System.out.println("Enter if you want to join(0) not (1)");
        Scanner scan = new Scanner(System.in);
        int chJoin = scan.nextInt();
        if (chJoin == 0){
            //UserControlClassのsetEvent()を使う
            UserControlClass ucc = new UserControlClass();
            boolean eventJoin = ucc.setUserEvent(1);
            if (eventJoin){
                System.out.println("joint successful");
            }else{
                System.out.println("joint err");
            }
        }else{
            // chJoin = 1  (何もしない)
        }
    }
}
