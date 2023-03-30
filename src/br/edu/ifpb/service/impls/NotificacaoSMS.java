package br.edu.ifpb.service.impls;

import br.edu.ifpb.service.ServicoDeNotificacao;

public class NotificacaoSMS implements ServicoDeNotificacao {
    @Override
    public void notificar(String user) {
        System.out.println("Notificando pelo SMS para o " + user);
    }
}
