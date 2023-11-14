package notify;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author eliza
 */
public class GroupUser implements User{
    
    private List<User> users = new ArrayList<>();
    
    @Override
    public void addUser(User user){
        users.add(user);
    }
    
    @Override
    public void removeUser(User user){
        users.remove(user);
    }
    
    @Override
    public void notifyUsers(String message){
        System.out.println("Enviando notificação para o grupo: ");
        for(User user: users){
            user.notifyUsers(message);
        }
    }
    
}
