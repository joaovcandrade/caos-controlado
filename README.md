# Projeto: Goblin S.A. - Sobrevivendo à Documentação de Código Legado 🧌

**De:** Chefe Orc, Gerente Sênior de Projetos Kaóticos
**Para:** O(A) Novo(a) Estagiário(a)
**Assunto:** RE: Sua contratação (e um pequeno aviso)

Parabéns por se juntar à Goblin S.A.! Li seu currículo. Impressionante. Agora, o trabalho de verdade.

Temos um... "legado". Um código-base tão antigo e complexo que alguns dizem que ele alcançou a senciência e se alimenta de café e desespero. Sua missão, caso decida aceitá-la (o contrato já foi assinado, então você vai aceitar), é documentar tudo. Precisamos de uma documentação **padrão ISO 9001, impecável, acadêmica,** para o nosso caos. A ironia é a melhor parte do meu trabalho.

## Sua Primeira Tarefa: Estude o Manual da Gambiarra

Antes de mais nada, leia o **`MANUAL_DA_GAMBIARRA_DOCUMENTADA.md`**. Ele é o único documento são nesta empresa. Ele ensina nosso padrão de qualidade para documentação. Siga-o à risca.

## A Missão Prática: Ler, Aprender, Treinar e Corrigir

Seu único objetivo é escrever a documentação Javadoc. **NÃO OUSE REFATORAR NADA!** Se você mudar uma linha, todo o castelo de cartas pode desmoronar. Apenas observe, entenda e descreva.

Sua jornada pelos nossos "departamentos":
1.  **`personagens` (Aprender):** Estude o arquivo `GoblinEstagiario.java`. Ele é o seu **exemplo perfeito** de como a documentação deve ser.
2.  **`personagens` e `artefatos` (Treinar):** Após aprender, sua tarefa é documentar do zero os arquivos `ChefeOrc.java`, `RecrutadorKobold.java` e `CatapultaInstavel.java`.
3.  **`calabouco` (Corrigir):** O estagiário anterior deixou anotações terríveis na `ArmadilhaEnferrujada.java`. Corrija-as para que sigam o padrão de qualidade.
4.  **`gambiarras` (Treino Avançado):** O coração da nossa empresa. Documente as complexas artes da `AlquimiaImprevisivel.java` e suas interfaces.

## Dicas para Sobrevivência com o IntelliJ IDEA
- **Gerar Esqueletos:** Digite `/**` e `Enter` acima de um método. O IntelliJ faz o trabalho sujo.
- **Espiar o Futuro:** Use a janela "Rendered Doc" (`View > Tool Windows > Documentation`) para ver como sua documentação ficará.
- **Executar Validação:** Use a janela do Maven (`View > Tool Windows > Maven`) para rodar `javadoc:javadoc`.

## Como Validar seu Trabalho (O Julgamento do Chefe Orc)
1.  **Validação Local:** Rode `mvn javadoc:javadoc`. Precisa dar **`BUILD SUCCESS`**, ou haverá consequências.
2.  **Compilar o Códice:** Rode `mvn site` e abra o arquivo `target/site/apidocs/index.html` para admirar seu trabalho.

## O Objetivo Final: Aprovação no GitHub Classroom
Seu objetivo é fazer os **testes da sua tarefa passarem no GitHub Classroom**. O check verde significa que seu Pull Request foi aprovado e que você talvez ganhe um bônus (em moedas de cobre).
🚨 Alerta 🚨 : por mais que os testes passem - a qualidade da sua documentação será avaliada posterioremente - então, capriche!!!!!