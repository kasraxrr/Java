import java.util.ArrayList;

public class UserList {
    private ArrayList<User>users;

    public UserList(){
        users=new ArrayList<>();
    }
    public int getNumberOfUsers(){
        return users.size();
    }
    public void addUser(User user){
        users.add(user);
    }
    public User getuser(int index){
        return users.get(index);
    }
    public User findAUserWithAccessTo(WebSite site){
        for(int i=0;i<users.size();i++){
            if (users.get(i).getAccessibleSite().contains(site)){
                return users.get(i);
            }
        }return null;
    }
    public Administrator findFirstAdministrator(){
        for(int i=0;i<users.size();i++){
           if (users.get(i)instanceof Administrator){
            return (Administrator) users.get(i);
           }
        }return null;
    }
}
