package Itfes;

import java.util.Scanner;

public class EventDetailPage extends EventControlClass{

    public void dispPage(){
        System.out.println("this is EventDetailPage");
        System.out.println("Choose one of this EventDetail(0)/menu(99)");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        switch (num) {
            case 0: // (0)show EventDetail
                // EventControlerClassからデータ取得
                System.out.println(EventControlerClass.EventName);
                System.out.println(EventControlerClass.EventDateStart);
                System.out.println(EventControlerClass.EventDateEnd);
                System.out.println(EventControlerClass.Picture);
                System.out.println(EventControlerClass.Location);
                System.out.println(EventControlerClass.Organizer);
                System.out.println(EventControlerClass.Description);
                System.out.println(EventControlerClass.review);

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
        if (chJoin ==0){
            //UserControlClassのsetEvent()を使う
            UserControlClass setEvent = new UserControlClass();
            boolean evnntJoin = setEvent.setUserEvent(EventControlerClass.EventName,EventControlerClass.EventDateStart,EventControlerClass.EventDateEnd,EventControlerClass.Picture,EventControlerClass.Location,EventControlerClass.Location,EventControlerClass.Organizer,EventControlerClass.Description,EventControlerClass.review);
            if (evnntJoin){
                // seikou
                System.out.println("joint successful");
            }else{
                // sippai
                System.out.println("joint err");
            }
        }else{
            // chJoin = 1  (何もしない)
        }
    }
}
