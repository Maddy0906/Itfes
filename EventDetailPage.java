package Itfes;

import java.util.Arrays;
import java.util.Scanner;

public class EventDetailPage extends DispPageClass {

    private int event_type, eventID;

    public EventDetailPage(int event_type, int eventID){
        this.event_type = event_type;
        this.eventID = eventID;
    }

    public void dispPage(){
        EventControlClass ecc = new EventControlClass();

        System.out.println("this is EventDetailPage");
        System.out.println("Choose one of this EventDetail(0) / back to Main page(1) / menu(99)");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        switch (num) {
            case 0: // (0)show EventDetail
                System.out.println(Arrays.asList(ecc.getEventDetail(event_type, this.eventID)));

                this.chJoin();
                break;
            case 1:
                MainPage mp = new MainPage();
                mp.dispPage();
                break;
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

            UserControlClass ucc = new UserControlClass();
            System.out.println("Enter EventID you want to join");
            boolean eventJoin = ucc.setUserEvent(scan.nextInt());
            if (eventJoin){
                System.out.println("joint successful");
            }else{
                System.out.println("joint err");
            }
        }else{
            // chJoin = 1  (何もしない)
        }
        this.dispPage();
    }
}
