package Observer;

import java.util.ArrayList;

public class MercadoDeAcoes {
    public Double inflacao;
    public Double commoditie;
    public Double pib;
    private ArrayList observers;

    public MercadoDeAcoes(double in, double c, double p){
        inflacao = in;
        commoditie = c;
        pib = p;
    }

    public MercadoDeAcoes(){
        observers = new ArrayList();
    }

    public void registrarObserver(Observer o){
        observers.add(o);
    }

    public void removerObserver(Observer o){
        int i = observers.indexOf(o);
        if (i >= 0){
            observers.remove(i);
        }
    }
    public void notificarObservers(double novoInflacao){
        for(int i=0; i< observers.size(); i++){
            Observer observer = (Observer)observers.get(i);
            observer.atualizar(novoInflacao);
        }
    }

    public double atual(MercadoDeAcoes m, double atual){

        m.inflacao = m.inflacao + atual;

        notificarObservers(m.inflacao);
        return m.inflacao;

    }
}



