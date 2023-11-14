public interface NotifyObserver extends User {
    void update(String message);

    @Override
    void addUser(NotifyObserver user);

    @Override
    void removeUser(User user);

    @Override
    void notifyUsers(String message);
}
