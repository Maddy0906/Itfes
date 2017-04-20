package Itfes;

/**
 * Created by Nobuaki on 2017-04-19.
 */
public class UserControlClass {


    public void newRegister(){
        
    }

    public void rewardAccount(){

    }

    public boolean login(){
        return true;
    }

    public String[][] getUserEvents(){
        /** It'll change to DB **/
        String[][] userEvents;
        testTools tt = new testTools();
        userEvents = tt.makeTestData(2);
        return userEvents;

    }

    public void setUserEvent(String eventTitle){
        // DB
    }

}
