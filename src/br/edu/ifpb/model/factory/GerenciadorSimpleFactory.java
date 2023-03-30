package br.edu.ifpb.model.factory;

import br.edu.ifpb.model.GerenciadorCarta;
import br.edu.ifpb.model.GerenciadorEmail;
import br.edu.ifpb.model.GerenciadorPush;
import br.edu.ifpb.model.GerenciadorSMS;

public class GerenciadorSimpleFactory {

    public GerenciadorAbstrato criarGerenciador(Gerenciadores gerenciador){
        switch (gerenciador){
            case GE_SMS:
                return new GerenciadorSMS();
            case GE_PUSH:
                return new GerenciadorPush();

            case GE_CARTA:
                return new GerenciadorCarta();

            case GE_EMAIL:
                return  new GerenciadorEmail();

            default:
                return null;
        }
    }
}
