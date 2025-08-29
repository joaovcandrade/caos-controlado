package com.goblinsa.personagens;

import java.util.List;

/**
 * [ESPAÇO PARA O JAVADOC DO ALUNO]
 */
public class RecrutadorKobold {

    /**
     * [ESPAÇO PARA O JAVADOC DO ALUNO]
     */
    public boolean avaliarCandidato(String nomeCandidato, int anosDeGambiarra) {
        if (anosDeGambiarra > 2) {
            System.out.println(nomeCandidato + " parece promissor, gosta de improvisar.");
            return true;
        } else {
            System.out.println(nomeCandidato + " muito organizado, não tem o perfil da empresa.");
            return false;
        }
    }
    
    /**
     * [ESPAÇO PARA O JAVADOC DO ALUNO]
     */
    public String gerarContratoVinculativo(String nomeCandidato) {
        return """
               CONTRATO DE SERVIÇOS TÉCNICOS DA GOBLIN S.A.
               PARTES: %s (CONTRATADO) e GOBLIN S.A. (CONTRATANTE)
               CLÁUSULA 1: O CONTRATADO concorda em trabalhar em troca de moedas de cobre e da promessa de pizza.
               CLÁUSULA 2: O CONTRATADO concorda em fornecer sua alma como garantia em caso de falha crítica em produção.
               CLÁUSULA 3: A definição de "horário de trabalho" é flexível e tende ao infinito.
               """.formatted(nomeCandidato);
    }
    
    /**
     * [ESPAÇO PARA O JAVADOC DO ALUNO]
     */
    public boolean verificarReferencias(List<ChefeOrc> referencias) {
        for (ChefeOrc chefe : referencias) {
            if (!chefe.estaDeBomHumor()) {
                System.out.println("As referências não são boas. Próximo!");
                return false;
            }
        }
        System.out.println("Referências impecáveis! (Todos os chefes estão milagrosamente de bom humor)");
        return true;
    }
}