package Itfes;

import java.util.Scanner;

/**
 * Created by madoka on 2017/04/19.
 */
public class MyPage extends DispPageClass {
    //check mail adress char
    public static final String MATCH_MAIL =
            "([a-zA-Z0-9][a-zA-Z0-9_.+\\-]*)@(([a-zA-Z0-9][a-zA-Z0-9_\\-]+\\.)+[a-zA-Z]{2,6})";

    public String dispPage() {
        System.out.println("This is My Page");
        System.out.println("press View profile(0) or Edit profile(1)");
        System.out.println("menu(99)");
        Scanner tabMenu = new Scanner(System.in);
        int num = tabMenu.nextInt();

        switch (num) {
            case 0: //Display User data(name,E-mail,category,password)
                //Call UseControlClass
                UseControl usCtrl = new usCtrl;
                //Display User information
                System.out.println(usCtrl.getUserDate());
                break;
            case 1: //Over ride User data
                System.out.println("Edit Name(0),E-mail(1),Category(2),Password(3)");
                Scanner editData = new Scanner(System.in);
                int editNum = editData.nextInt();

                switch (editNum) {
                    case 0://Edit Name
                        System.out.println("Input New Name");
                        Scanner name = new Scanner(System.in);
                        String newName = name.nextLine();
                        //Over ride to UserContorolClass
                        name.setName = (newName);
                        return newName;
                    break;
                    case 1://Edit E-mail
                        System.out.println("Input New E-mail");
                        Scanner email = new Scanner(System.in);
                        String newEmail = email.nextLine();
                        //check mail adress
                        if (newEmail.matches(MATCH_MAIL)) {
                            System.out.println("true");
                            //Over ride to UserContorolClass
                            email.setEmail = (newEmail);
                            return newEmail;
                        } else {
                            System.out.println("error");
                        }
                        break;
                    case 2://Edit Category
                        System.out.println("Input New Category");
                        Scanner category = new Scanner(System.in);
                        String newCategory = category.nextLine();
                        //Over ride to UserContorolClass
                        category.setCategory = (newCategory);
                        return newCategory;
                    break;
                    case 3://Edit Password
                        System.out.println("Input New Password");
                        Scanner pass = new Scanner(System.in);
                        String newPass = pass.nextLine();
                        //Over ride to UserContorolClass
                        password.setPass = (newPass);
                        return newPass;
                    break;
                    default:
                        System.out.println("error");
                }
                break;

            case 99://call menu
                public void callMenu () {
            }

            default:
                System.out.println("error");

        }
    }

}
