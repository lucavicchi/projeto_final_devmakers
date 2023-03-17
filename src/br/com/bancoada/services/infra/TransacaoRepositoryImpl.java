package services.infra;

import br.com.bancoada.domain.Transacao;
import br.com.bancoada.services.TransacaoRepository;

import java.util.List;

public class TransacaoRepositoryImpl implements TransacaoRepository {

    @Override
    public void salvarTransacao(Transacao transacao) {
        // Implementação da lógica para salvar uma transação
    }

    @Override
    public List<Transacao> buscarTransacoesPorConta(String numeroConta) {
        // Implementação da lógica para buscar as transações de uma conta específica
    }

    @Override
    public List<Transacao> buscarTodasTransacoes() {
        // Implementação da lógica para buscar todas as transações
        return null;
    }

}

