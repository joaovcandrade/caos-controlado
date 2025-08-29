package com.goblinsa.personagens;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * [ESPAÇO PARA O JAVADOC DO ALUNO]
 */
public class ChefeOrc {

    /**
     * [ESPAÇO PARA O JAVADOC DO ALUNO]
     */
    public void delegarTarefa(GoblinEstagiario subordinado, String tarefa) {
        System.out.println("O Chefe Orc grita para " + subordinado.getNome().toUpperCase() 
            + ": 'FAÇA A TAREFA: " + tarefa.toUpperCase() + "! PARA ONTEM!'");
    }

    /**
     * [ESPAÇO PARA O JAVADOC DO ALUNO]
     */
    public boolean aprovarPullRequest(boolean comConflitos) {
        if (comConflitos) {
            System.out.println("REJEITADO! Amador!");
            return false;
        }
        if (Math.random() < 0.80) { // 80% de chance
            System.out.println("Ok, tanto faz. MERGE!");
            return true;
        } else {
            System.out.println("Não gostei. Mude a cor desse botão para um tom mais... Orc.");
            return false;
        }
    }

    /**
     * [ESPAÇO PARA O JAVADOC DO ALUNO]
     */
    public boolean estaDeBomHumor() {
        return Math.random() < 0.05; // Só 5% do tempo.
    }
    
    /**
     * [ESPAÇO PARA O JAVADOC DO ALUNO]
     */
    public Map<String, String> realizarReuniaoDeStatus(List<GoblinEstagiario> participantes) {
        Map<String, String> statusReport = new HashMap<>();
        String[] desculpas = {
            "Está 99% pronto.", 
            "Culpa do cache.", 
            "Na minha máquina funciona.",
            "É uma feature, não um bug.",
            "A API de terceiros mudou."
        };
        Random random = new Random();
        for (GoblinEstagiario participante : participantes) {
            statusReport.put(participante.getNome(), desculpas[random.nextInt(desculpas.length)]);
        }
        return statusReport;
    }
}