package br.com.bancoada.services.infra;

import br.com.bancoada.domain.Conta;
import br.com.bancoada.services.ContaRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContaRepositoryImpl implements ContaRepository {

    private Map<Integer, Conta> contas;

    public ContaRepositoryImpl() {
        contas = new HashMap<>();
    }

    @Override
    public Conta buscarPorNumero(int numero) {
        return contas.get(numero);
    }

    @Override
    public List<Conta> buscarPorTitular(String nomeTitular) {
        List<Conta> contasDoTitular = new ArrayList<>();

        for (Conta conta : contas.values()) {
            if (conta.getTitular().equals(nomeTitular)) {
                contasDoTitular.add(conta);
            }
        }
        return contasDoTitular;
    }

    @Override
    public void salvar(Conta conta) {
        contas.put(conta.getNumero(), conta);
    }

    @Override
    public Conta criarConta(String numeroConta, double saldoInicial) {
        return null;
    }

    @Override
    public Conta buscarContaPorNumero(String numeroConta) {
        return null;
    }

    @Override
    public List<Conta> buscarContas() {
        return null;
    }
}
