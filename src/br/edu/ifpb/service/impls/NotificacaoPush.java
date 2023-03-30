package br.edu.ifpb.service.impls;

import br.edu.ifpb.service.ServicoDeNotificacao;

public class NotificacaoPush implements ServicoDeNotificacao {
    @Override
    public void notificar(String user) {
        System.out.println("Notificando via push para o  " + user);
    }
}
