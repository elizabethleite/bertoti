import java.util.HashMap;
import java.util.Map;

public class BancoFacade {

    private Map<Integer, Usuario> banco;

    public BancoFacade(){
        banco = new HashMap<>();
    }

    public void adicionarUsuario(Integer id, String nome, String email){
        Usuario usuario = new Usuario (id, nome, email);
        banco.put(id, usuario);
        System.out.println("Usuário adicionado ao banco de dados: "+ usuario);
    }



    public Usuario getUsuario(Integer id){
        Usuario usuario = banco.get(id);
        if(usuario != null){
            System.out.println();
        } else{
            System.out.println("Usuário com ID" + id + "não encontrado no banco de dados");
        }
        return usuario;
    }

    public void removeUsuario(Integer id){
        Usuario usuario = banco.remove(id);
        if(usuario != null){
            System.out.println("Usuário removido do banco de dados: " + usuario);
        } else{
            System.out.println("Usuário com ID " + id + "não encontrado no banco de dados");
        }
    }
}
