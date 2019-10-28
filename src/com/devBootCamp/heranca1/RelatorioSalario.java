package com.devBootCamp.heranca1;

import java.util.List;

public class RelatorioSalario {

    public void resumoSalario(Funcionario funcionario) {
        System.out.println("Funcionário: " + funcionario.getNome());
        System.out.println("Salário: " + funcionario.calcularSalario());
    }

    public void resumoSalario(List<Funcionario> funcionarios) {
        for (Funcionario funcionario : funcionarios) {
            resumoSalario(funcionario);
        }
    }

}
