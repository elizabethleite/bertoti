package notify;

/**
 *
 * @author eliza
 */
public interface User {
    
    void addUser(User user);
    void removeUser(User user);
    void notifyUsers(String message);
}


