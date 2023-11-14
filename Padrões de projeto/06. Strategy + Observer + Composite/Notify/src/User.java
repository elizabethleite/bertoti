public interface User {
    void addUser(NotifyObserver user);

    void addUser(User user);

    void removeUser(User user);
    void notifyUsers(String message);
}
