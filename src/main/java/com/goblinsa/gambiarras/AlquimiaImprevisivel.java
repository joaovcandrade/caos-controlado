package com.goblinsa.gambiarras;

import com.goblinsa.personagens.GoblinEstagiario;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;

/**
 * [ESPAÇO PARA O JAVADOC DO ALUNO]
 */
public class AlquimiaImprevisivel {

    /**
     * [ESPAÇO PARA O JAVADOC DO ALUNO]
     */
    public record ResultadoPocao(String nome, String efeito, boolean explodiu) {}

    /**
     * [ESPAÇO PARA O JAVADOC DO ALUNO]
     */
    public <T extends Ingrediente> Optional<T> encontrarIngredienteRaro(List<T> possiveisIngredientes) {
        for (T ingrediente : possiveisIngredientes) {
            if (ingrediente.getNivelDeNojeira() > 90) {
                if (Math.random() < 0.25) { // 25% de chance
                    return Optional.of(ingrediente);
                }
            }
        }
        return Optional.empty();
    }

    /**
     * [ESPAÇO PARA O JAVADOC DO ALUNO]
     */
    public void misturarPocao(List<Ingrediente> ingredientes, Consumer<ResultadoPocao> callback) {
        int nojeiraTotal = ingredientes.stream().mapToInt(Ingrediente::getNivelDeNojeira).sum();
        
        if (nojeiraTotal > 150) {
            callback.accept(new ResultadoPocao("Falha Crítica Faiscante", "Uma pequena cratera e cheiro de ovo podre.", true));
        } else {
            callback.accept(new ResultadoPocao("Poção Marrom Borbulhante", "Provavelmente curável... ou não.", false));
        }
    }
    
    /**
     * [ESPAÇO PARA O JAVADOC DO ALUNO]
     */
    public Map<String, Integer> catalogarIngredientes(List<Ingrediente> inventario) {
        return inventario.stream()
            .collect(Collectors.toMap(
                Ingrediente::getNome,
                Ingrediente::getNivelDeNojeira,
                (nojeiraExistente, novaNojeira) -> nojeiraExistente + novaNojeira // Em caso de duplicatas, soma
            ));
    }
}