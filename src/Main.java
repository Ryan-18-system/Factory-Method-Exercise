import br.edu.ifpb.model.factory.GerenciadorAbstrato;
import br.edu.ifpb.model.GerenciadorPush;
import br.edu.ifpb.model.GerenciadorEmail;
import br.edu.ifpb.model.GerenciadorSMS;
import br.edu.ifpb.model.factory.GerenciadorSimpleFactory;
import br.edu.ifpb.model.factory.Gerenciadores;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GerenciadorSimpleFactory gerenciadorFactory = new GerenciadorSimpleFactory();
        List<GerenciadorAbstrato> gerenciadores = Arrays.asList(
                gerenciadorFactory.criarGerenciador(Gerenciadores.GE_CARTA),
                gerenciadorFactory.criarGerenciador(Gerenciadores.GE_EMAIL),
                gerenciadorFactory.criarGerenciador(Gerenciadores.GE_PUSH),
                gerenciadorFactory.criarGerenciador(Gerenciadores.GE_SMS)
        );

        gerenciadores.forEach(r -> r.send("Ryan Nóbrega Brandão"));
    }
}