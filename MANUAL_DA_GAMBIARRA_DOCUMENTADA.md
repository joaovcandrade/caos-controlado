# O Manual da Gambiarra Documentada

## (Como escrever Javadoc que até um Chefe Orc entende)

Bem-vinda(o) à tarefa mais nobre da Goblin S.A.: transformar caos em clareza. Nosso código às vezes é… “expressivo”. Já a documentação precisa ser **cristalina, útil e consistente**. Este guia é curto, direto e cheio de modelos prontos para você copiar e colar com alegria (e café).

---

## 1) Três passos para um ótimo Javadoc (sempre)

1. **Resumo em uma frase:** diga o *quê* faz, de forma objetiva (“Retorna…”, “Calcula…”, “Cria…”).
2. **Contrato explícito:** documente **pré-condições** (`@param`, nulos/faixas), **efeitos colaterais** (estado alterado? imprime? loga?), **exceções** (`@throws`).
3. **Detalhes úteis + links internos:** complemente com exemplos rápidos, `{@code}` para trechos de código e `{@link}` para navegar na API.

> Regra de ouro: escreva como se quem lê **não pudesse ver o código**.

---

## 2) Anatomia de um comentário Javadoc

```java
/**
 * Resumo curto, claro e completo (1 frase).
 * <p>
 * Parágrafo(s) com contexto, efeitos e detalhes de uso.
 *
 * @param x descrição objetiva (unidades, domínio válido, nulo permitido?)
 * @param y ...
 * @return o que exatamente é retornado (unidades, casos-limite)
 * @throws IllegalArgumentException quando <condição>
 * @since 1.0
 */
```

**Estilo**: 3ª pessoa, presente (“Retorna…”, “Define…”).
**Inline tags**: `{@code}`, `{@link Tipo#método(...)}`, `{@value CONST}` quando ajudar.

---

## 3) Block tags que importam (e como acertar a mão)

* `@param <nome>` : **significado**, **unidades** e **restrições** (não nulo, intervalos, formato).
* `@return` : descreva **exatamente** o que volta e **quando** (casos-limite, coleções vazias, ordem).
* `@throws` : **quando** lança e **por quê** (contrato violado, IO, concorrência).
* `@since` : histórico de introdução.
* `@see` : ponha referências úteis (para links dentro do texto, use `{@link}`).

**Extras modernos** (use quando fizer sentido):

* `@apiNote` : dicas de uso para consumidores da API.
* `@implSpec` : contrato que implementações devem cumprir (invariantes, complexidade, ordem).
* `@implNote` : detalhes da implementação que **não** fazem parte do contrato.

---

## 4) Inline tags que deixam tudo legível

* `{@code ...}` : para qualquer coisa que “parece código” (nomes, flags, literais).
* `{@link Tipo#método}` / `{@linkplain ...}` : referência navegável (a segunda sem estilo de código).
* `{@value CONST}` : expande o valor de constantes públicas.

Dica: linke só o que **ajuda de verdade** a navegação.

---

## 5) Contratos de verdade: pré, pós e efeitos

* **Pré**: o que deve ser verdade *antes*? (não nulo, tamanho, formato, estado)
* **Pós**: o que fica garantido *depois*? (ordem, idempotência, intervalos do retorno)
* **Efeitos colaterais**: log, IO, mutação de estado, bloqueios, tempo esperado

Documente com `@param`, `@return`, `@throws` e, quando necessário, `@implSpec`.

---

## 6) Ferramentas & validação (IDE e Maven)

* **IntelliJ IDEA**: digite `/**` e pressione **Enter** para gerar o esqueleto; visualize em *View → Tool Windows → Documentation*.
* **Linha de comando**: `mvn javadoc:javadoc`.
* **Qualidade máxima**: ative validação estrita (doclint) e falha em aviso/erro (já configurado no `pom.xml` deste projeto).

    * Benefícios: flags de HTML malformado, tags ausentes, links quebrados e contratos incompletos.

---

## 7) Erros comuns (e antídotos rápidos)

* **Resumo vago** (“Faz coisas”) → troque por uma frase objetiva e completa.
* **Esquecer nulos/faixas** → diga domínio válido e o que acontece fora dele.
* **Descrever *como* em vez do *quê*** → foque no comportamento observável.
* **HTML quebrado** → feche tags, prefira `{@code}` para qualquer “<>”.
* **Linkar tudo** → crie `{@link}` apenas quando ajudar de fato.

---

## 8) Padrão de qualidade Goblin : checklist final

* [ ] **Abertura perfeita**: a primeira frase explica o propósito por completo.
* [ ] **Contratos claros**: `@param`, `@return`, `@throws` com domínios e causas.
* [ ] **Efeitos colaterais**: log, IO, mutação, concorrência documentados.
* [ ] **Inline tags**: `{@code}`/`{@link}` usados com critério.
* [ ] **Notas de API/implementação**: incluiu `@apiNote`, `@implSpec` ou `@implNote` quando necessário?
* [ ] **Validação**: doclint/Maven passam sem warnings.

---

**Fechamento goblin:**
Escreva como quem guia um(a) colega no escuro : seu Javadoc é a lanterna. Código muda; **documentação fica**. Se a build ficar vermelha, tome um café e volte ao checklist. Se ficar verde… bônus em moedas de cobre!
