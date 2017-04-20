package Itfes;

import java.util.Scanner;

/**
 * Created by kaorihirata on 2017-04-19.
 */
public class LoginAndRegisterPage implements Validate {
    public void vlidate(){};

    public void dispPage(){
        System.out.println("this is LoginAndRegisterPage");
    }

    public void login(){
        System.out.println("Choose and Enter signup(0)linkdin(1)");
        Scanner Scan = new Scanner(System.in);
        int login = Scan.nextInt();

        switch (login)
        case 0:{
            System.out.println("do you have a account?　yes(0) NO(1)");
            Scanner Scan = new Scanner(System.in);
            int accountCh = Scan.nextInt();
            if (accountCh ==0){
                System.out.println("put Email");
                System.out.println("put password");
                //内容チェック
                //main pageに移行
            }else{
                System.out.println("this is Create accountPage");
                System.out.println("put name");
                System.out.println("put Email");
                System.out.println("put password");
                System.out.println("put category");
                //内容チェック
                System.out.println("Create account successful");
                //main pageに移行
             }
            }
        }
        case 1:{} //(1) linkdin
    }



}

