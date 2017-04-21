package Itfes;

/**
 * Created by Nobuaki on 2017-04-19.
 */
public class UserControlClass {

    public boolean newRegister(String name, String eMail,String password, String category){
        /** It'll change to DB **/
        String[][] userSampleData = this.getUserSampleData();

        for(int i=0; i<userSampleData.length;i++){
            if(userSampleData[i][1].equals(eMail)){
                System.out.println("This eMail already exists");
                return false;
            }
        }

        // 疑似DBに登録
        this.saveUserAccount(name, eMail, password, category);

        return true;
    }

    public void rewardAccount(){

    }

    public boolean login(String eMail,String password){

        String[][] userSampleData = this.getUserSampleData();

        for(int i=0; i<userSampleData.length;i++){
            if(userSampleData[i][1].equals(eMail) && userSampleData[i][2].equals(password)){
                this.saveUserAccount(userSampleData[i][0], userSampleData[i][1], userSampleData[i][2], userSampleData[i][3]);
                return true;
            }
        }

        System.out.println("This eMail is not found or this password does not match");
        return false;

    }

    public String[][] getUserEvents(){
        /** It'll change to DB **/
        String[][] userEvents;
        EventControlClass ecc = new EventControlClass();
        userEvents = ecc.makeTestData(2);
        return userEvents;
    }

//    public boolean setUserEvent(int eventID){
//        return this.setUserEvent(eventID);
//    }

//    public String[] getUserAccountInformation(){
//        return this.getUserAccount();
//    }





    /**
     * -------------------------------------------------------------
     * We don't have database so we can't save userData, eventData.
     * This class can save above data tentatively.
     *
     * We'll replace these method with Database.
     * -------------------------------------------------------------
     */

    public String[][] getUserSampleData(){
        String [][] testUserData = new String[3][4];
        /**
         * name, eMail, password, category
         */
        testUserData[0][0] = "Maddy";
        testUserData[0][1] = "abc@gmail.com";
        testUserData[0][2] = "test";
        testUserData[0][3] = "Web developer";

        testUserData[1][0] = "Kaori";
        testUserData[1][1] = "efg@nifty.com";
        testUserData[1][2] = "hogehoge";
        testUserData[1][3] = "Front End Engineer";

        testUserData[2][0] = "Nobubu";
        testUserData[2][1] = "hijk@mac.com";
        testUserData[2][2] = "brabrara";
        testUserData[2][3] = "Server Side Engineer";

        return testUserData;

    }


    public static String userName, userEmail, userPassword, userCategory;
    public static int[] userEventlist = new int[5];
    public static int count=0;

    public void saveUserAccount(String name, String eMail, String password, String category){
        userName = name;
        userEmail = eMail;
        userPassword = password;
        userCategory = category;
    }

    public String[] getUserAccount(){
        String[] userInformation = new String[4];
        userInformation[0] = userName;
        userInformation[1] = userEmail;
        userInformation[2] = userPassword;
        userInformation[3] = userCategory;

        return userInformation;
    }

    public boolean setUserEvent(int EventID){
        if(count == 5){
            System.out.println("Error setEvent overflow !");
            return false;
        }else{
            userEventlist[count] = EventID;
            count++;
            return true;
        }
    }

}
