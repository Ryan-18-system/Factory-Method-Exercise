package br.edu.ifpb.service.impls;

import br.edu.ifpb.service.ServicoDeNotificacao;

public class NotificacaoEmail implements ServicoDeNotificacao {
    @Override
    public void notificar(String user) {
        System.out.println("Notificando pelo email para o  " + user);
    }
}
