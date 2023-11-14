public class BasicUser implements User {

    private String nome;

    public BasicUser(String nome) {
        this.nome = nome;
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
        System.out.println("Emviando notificação para " + nome);
    }
}
