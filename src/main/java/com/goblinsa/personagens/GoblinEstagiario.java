package com.goblinsa.personagens;

import java.util.Objects;

/**
 * Modela um estagiário da empresa Goblin S.A., definindo seus atributos e ações.
 * <p>
 * Esta classe serve como um <strong>padrão-ouro</strong> de documentação Javadoc.
 * Note o uso de tags HTML para formatação, a descrição precisa de parâmetros,
 * retornos, e o tratamento explícito de pré-condições e efeitos colaterais.
 *
 * @author A Gerência (via Chefe Orc)
 * @version 1.0-RELEASE
 * @since 2025-Q3
 */
public class GoblinEstagiario {

    private final String nome;
    private int nivelDeCafeina; // expresso em miligramas

    /**
     * Constrói uma nova instância de GoblinEstagiario.
     * O nível de cafeína inicial é padronizado em 100mg para garantir
     * um mínimo de produtividade matinal.
     *
     * @param nome O nome do estagiário. Não pode ser {@code null} ou vazio.
     * @throws NullPointerException se o nome for {@code null}.
     */
    public GoblinEstagiario(String nome) {
        Objects.requireNonNull(nome, "O nome do estagiário não pode ser nulo.");
        this.nome = nome;
        this.nivelDeCafeina = 100;
    }
    
    /**
     * Retorna o nome do estagiário.
     * @return o nome do estagiário.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Gera uma string que simula código de baixa qualidade, popularmente
     * conhecido como "código espaguete".
     * <p>
     * Este método não possui efeitos colaterais e não modifica o estado do objeto.
     *
     * @return Uma {@code String} representando código complexo e não formatado.
     */
    public String escreverCodigoSpaghetti() {
        return "for(int i=0;i<10;i++){if(i%2==0){System.out.println(\"Fizz\");}else{System.out.println(\"Buzz\");}}";
    }
    
    /**
     * Simula a tentativa de corrigir uma falha na build de integração contínua.
     * <p>
     * Esta ação consome cafeína e tem uma alta probabilidade de não surtir efeito,
     * refletindo cenários de depuração sob pressão.
     * Este método altera o estado interno do objeto ao reduzir {@code nivelDeCafeina}.
     *
     * @param commitsDesesperados O número de commits a serem feitos na tentativa.
     * @return O novo nível de cafeína após a tentativa estressante.
     * @throws IllegalStateException se o nível de cafeína for inferior a 50mg,
     * pois é uma pré-condição para realizar esta tarefa.
     */
    public int tentarConsertarBuild(int commitsDesesperados) {
        if (this.nivelDeCafeina < 50) {
            throw new IllegalStateException("Nível de cafeína criticamente baixo! Abortar operação!");
        }
        this.nivelDeCafeina -= commitsDesesperados * 10; // Cada commit consome 10mg
        System.out.println(this.nome + " fez " + commitsDesesperados + " commits. A build... ainda está vermelha.");
        return this.nivelDeCafeina;
    }

    /**
     * Solicita orientação técnica ou moral ao superior hierárquico direto.
     *
     * @param chefe A instância do {@link ChefeOrc} a quem o pedido é direcionado.
     * A referência não pode ser {@code null}.
     * @return {@code true} se o chefe estiver disposto a ajudar (raro),
     * {@code false} caso contrário.
     * @throws NullPointerException se o parâmetro {@code chefe} for {@code null}.
     */
    public boolean pedirAjudaAoChefe(ChefeOrc chefe) {
        Objects.requireNonNull(chefe, "Não se pode pedir ajuda a um chefe que não existe!");
        return chefe.estaDeBomHumor();
    }
}