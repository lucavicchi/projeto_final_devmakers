package br.com.bancoada.services;

import br.com.bancoada.domain.Transacao;

import java.util.List;

public interface TransacaoRepository {
    void salvarTransacao(Transacao transacao);

    List<Transacao> buscarTransacoesPorConta(String numeroConta);

    List<Transacao> buscarTodasTransacoes();
}
