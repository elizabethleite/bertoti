public class ObserverNotification implements NotifyObserver{

    private String nome;

    public ObserverNotification(String nome){
        this.nome = nome;
    }

    @Override
    public void update(String message){
        System.out.println(nome + "recebeu a notificação" + message);
    }

    @Override
    public void addUser(NotifyObserver user) {

    }

    @Override
    public void addUser(User user) {

    }

    @Override
    public void removeUser(User user) {

    }

    @Override
    public void notifyUsers(String message) {

    }
}
