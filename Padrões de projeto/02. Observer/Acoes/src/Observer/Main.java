package Observer;

public class Main {
    public static void main(String[] args) {

       MercadoDeAcoes d = new MercadoDeAcoes();
       Brasil brasil = new Brasil();
       EstadosUnidos eua = new EstadosUnidos();

       d.registrarObserver(brasil);
       d.registrarObserver(eua);

       MercadoDeAcoes mercado = new MercadoDeAcoes(0.12,1964.20, 2651);
       mercado.inflacao = d.atual(mercado, 0.12);
    }
}