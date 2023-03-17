package br.com.bancoada.services;

import br.com.bancoada.domain.Conta;
import br.com.bancoada.repository.Repository;

import java.util.List;

public interface ContaRepository {
    static Repository<Object> getInstance() {
    }

    Conta criarConta(String numeroConta, double saldoInicial);

    Conta buscarContaPorNumero(String numeroConta);

    List<Conta> buscarContas();
}
