package com.goblinsa.gambiarras;

/**
 * [ESPAÇO PARA O JAVADOC DO ALUNO]
 */
public abstract class PocaoBase {
    /**
     * Aplica o efeito primário da poção em um alvo.
     * @param alvo O alvo que receberá o efeito da poção.
     * @implSpec
     * A implementação deste método deve ser idempotente sempre que possível.
     * Qualquer subclasse deve garantir que a aplicação do efeito é registrada
     * em um log para fins de depuração de acidentes alquímicos.
     */
    public abstract void aplicarEfeito(Object alvo);
}