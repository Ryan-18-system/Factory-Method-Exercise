package br.edu.ifpb.model;

import br.edu.ifpb.model.factory.GerenciadorAbstrato;
import br.edu.ifpb.service.ServicoDeNotificacao;
import br.edu.ifpb.service.impls.NotificacaoCarta;

public class GerenciadorCarta extends GerenciadorAbstrato {
    @Override
    protected ServicoDeNotificacao obterServico() {
        return new NotificacaoCarta();
    }
}
