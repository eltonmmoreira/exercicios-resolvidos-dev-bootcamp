package com.devBootCamp.exercicio03;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GerenciadorDeEmprestimos {
    private List<Emprestimo> emprestimos = new ArrayList<>();
    private List<Tentativa> tentativas = new ArrayList<>();

    public boolean emprestar(Livro livro, Aluno aluno) {
        boolean emprestado;
        for (Emprestimo emprestimo : emprestimos) {
            emprestado = livro.getId().equals(emprestimo.getLivro().getId());
            if (emprestado) {
                addTentativa(livro);
                return false;
            }
        }
        return emprestimos.add(new Emprestimo(aluno, livro, LocalDate.now(), LocalDate.now().plusDays(7)));
    }

    private void addTentativa(Livro livro) {
        boolean possuiTentativa;
        for (Tentativa tentativa : tentativas) {
            possuiTentativa = tentativa.getLivro().getId().equals(livro.getId());
            if (possuiTentativa) {
                tentativa.addTentativa();
                return;
            }
        }
        tentativas.add(new Tentativa(livro, 1));
    }

    public List<Emprestimo> getEmprestimos() {
        return Collections.unmodifiableList(emprestimos);
    }

    public String getHistoricoDeEmprestimos() {
        StringBuilder historico = new StringBuilder("Empréstimos:");
        for (Emprestimo emprestimo : emprestimos) {
            historico.append("\n")
                    .append("\n")
                    .append("Aluno: ")
                    .append( emprestimo.getAluno().getNome())
                    .append("\n")
                    .append("Livro: ")
                    .append(emprestimo.getLivro().getTitulo())
                    .append("\n")
                    .append("Data Empréstimo: ")
                    .append(emprestimo.getDateEmprestimo().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        }
        return historico.toString();
    }

    public Tentativa livroComMaisTentativasEEmprestimos() {
        for (Emprestimo emprestimo : emprestimos) {
            for (Tentativa tentativa : tentativas) {
                if (tentativa.getLivro().getId().equals(emprestimo.getLivro().getId())) {
                    tentativa.addTentativa();
                }
            }
        }

        Tentativa maiorTentativa = null;
        for (Tentativa tentativa : tentativas) {
            if (maiorTentativa == null || tentativa.getQuantidade() > maiorTentativa.getQuantidade()) {
                maiorTentativa = tentativa;
            }
        }

        return maiorTentativa;
    }
}
