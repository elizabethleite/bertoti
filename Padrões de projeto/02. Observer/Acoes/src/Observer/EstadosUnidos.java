package Observer;

public class EstadosUnidos implements Observer{
    public void atualizar(double inflacao){
        display(inflacao);

    }
    public void display(double in){
        System.out.println("Indicadores de risco do mercado");
        System.out.println("A inflação no Estados Unidos está: " +in);
    }
}
