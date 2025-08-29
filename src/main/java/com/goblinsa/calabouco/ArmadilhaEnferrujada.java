package com.goblinsa.calabouco;

/**
 * ativa a armadilha.
 */
public class ArmadilhaEnferrujada {
    
    private boolean estaAtiva = false;
    
    /**
     * ativa a armadilha.
     */
    public void ativar(String alvo) {
        this.estaAtiva = true;
        System.out.println(alvo + " ativou a armadilha! *som de mola enferrujada*");
    }
    
    /**
     * causa dano.
     * @return o dano
     */
    public void causarDanoDeTetano() {
        if (this.estaAtiva) {
            System.out.println("Dano de tétano aplicado! É melhor ter tomado vacina!");
        }
    }
    
    /**
     * Reseta a armadilha.
     * @param codigo o código para resetar.
     */
    public boolean resetar(int codigoSecreto) {
        if (codigoSecreto == 1234) {
            this.estaAtiva = false;
            return true;
        }
        System.out.println("CLIQUE! A armadilha não resetou.");
        return false;
    }
}