package br.edu.ifpb.model;

import br.edu.ifpb.model.factory.GerenciadorAbstrato;
import br.edu.ifpb.service.ServicoDeNotificacao;
import br.edu.ifpb.service.impls.NotificacaoPush;

public class GerenciadorPush extends GerenciadorAbstrato {
    @Override
    protected ServicoDeNotificacao obterServico() {
        return new NotificacaoPush();
    }
}
