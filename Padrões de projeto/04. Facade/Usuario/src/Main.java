public class Main {
    public static void main(String[] args) {
        BancoFacade bancoFacade = new BancoFacade();

        bancoFacade.adicionarUsuario(1, "Helena Cruz", "helena.cruz@gmail.com");
        bancoFacade.adicionarUsuario(2, "José Silva", "jose.silva@gmail.com");

        Usuario usuario = bancoFacade.getUsuario(1);

        bancoFacade.removeUsuario(1);
    }
}