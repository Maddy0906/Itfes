package Itfes;

/**
 * Created by Nobuaki on 2017-04-19.
 */
public class UserControlClass {
    private String name;
    private String eMail;
    private String password;
    private String category;

    public boolean newRegister(String name, String eMail,String password, String category){
        /** It'll change to DB **/
        String[][] userSampleData = this.getUserSampleData();
        //if(name.equals(this.getUserSampleData()[0][0])) return false;

        for(int i=0; i<userSampleData.length;i++){
            if(userSampleData[i][1].equals(eMail)){
                System.out.println("This eMail already exists");
                return false;
            }
        }

        this.setName(name);
        this.seteMail(eMail);
        this.setPassword(password);
        this.setCategory(category);

        return true;
    }

    public void rewardAccount(){

    }

    public boolean login(String eMail,String password){

        String[][] userSampleData = this.getUserSampleData();
        boolean findEmail = false, findPassword = false;

        for(int i=0; i<userSampleData.length;i++){
            if(userSampleData[i][1].equals(eMail)){
                findEmail = true;
            }
        }

        if(findEmail){
            System.out.println("This eMail is not found");
            return false;
        }

        for(int i=0; i<userSampleData.length;i++){
            if(userSampleData[i][2].equals(password)){
                findPassword = true;
            }
        }
        if(findPassword) return true;
        else {
            System.out.println("This password does not match");
            return false;
        }
    }

    public String[][] getUserEvents(){
        /** It'll change to DB **/
        String[][] userEvents;
        testTools tt = new testTools();
        userEvents = tt.makeTestData(2);
        return userEvents;

    }

    public boolean setUserEvent(int eventID){
        // DB
        return true;
    }

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
