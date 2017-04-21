package Itfes;

/**
 * Created by Nobuaki on 2017-04-19.
 */
public class UserControlClass {

    testTools tt = new testTools();

    public boolean newRegister(String name, String eMail,String password, String category){
        /** It'll change to DB **/
        String[][] userSampleData = tt.getUserSampleData();
        //if(name.equals(this.getUserSampleData()[0][0])) return false;

        for(int i=0; i<userSampleData.length;i++){
            if(userSampleData[i][1].equals(eMail)){
                System.out.println("This eMail already exists");
                return false;
            }
        }

        // 疑似DBに登録
        tt.saveUserAccount(name, eMail, password, category);

        return true;
    }

    public void rewardAccount(){

    }

    public boolean login(String eMail,String password){

        String[][] userSampleData = tt.getUserSampleData();

        for(int i=0; i<userSampleData.length;i++){
            if(userSampleData[i][1].equals(eMail) && userSampleData[i][2].equals(password)){
                tt.saveUserAccount(userSampleData[i][0], userSampleData[i][1], userSampleData[i][2], userSampleData[i][3]);
                return true;
            }
        }

        System.out.println("This eMail is not found or this password does not match");
        return false;

    }

    public String[][] getUserEvents(){
        /** It'll change to DB **/
        String[][] userEvents;
        testTools tt = new testTools();
        userEvents = tt.makeTestData(2);
        return userEvents;

    }

    public boolean setUserEvent(int eventID){
        return tt.setUserEvent(eventID);
    }

    public String[] getUserAccountInformation(){
        return tt.getUserAccount();
    }
}
