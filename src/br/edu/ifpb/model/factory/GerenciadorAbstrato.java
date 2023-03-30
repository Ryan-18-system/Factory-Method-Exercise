package br.edu.ifpb.model.factory;

import br.edu.ifpb.service.ServicoDeNotificacao;

public abstract class GerenciadorAbstrato {
    public void send(String user){
        this.obterServico().notificar(user);
    }
    protected  abstract ServicoDeNotificacao obterServico();
}
