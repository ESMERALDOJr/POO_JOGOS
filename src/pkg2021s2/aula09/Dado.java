package pkg2021s2.aula09;

import java.util.Random;

public class Dado extends Jogo {
    
    @Override
    public void jogaJogo(){
        Random rnd = new Random();
        super.setResultado(rnd.nextInt(6)+1);
    }
    
    @Override
    public void setAposta(int aposta){
        if(aposta > 6 || aposta < 1)
            System.out.println("Valor inválido para o dado!");
        else
            super.setAposta(aposta);
    }
    
    @Override
    public void setResultado(int resultado){
        System.out.println("Ops, não pode roubar no dado!");
    }
}
