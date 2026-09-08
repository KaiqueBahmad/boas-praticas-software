# boas-praticas-software

Sistema simples de cálculo de média escolar, utilizado para praticar boas práticas
de desenvolvimento de software.

## Estrutura

```
src/escola/
├── Sistema.java              # ponto de entrada, apenas orquestra o fluxo
├── Aluno.java                # dados do aluno (nome e notas)
├── CalculadoraDeMedia.java   # cálculo da média
├── AvaliadorDeSituacao.java  # regra de aprovação/reprovação
├── SituacaoAcademica.java    # situações possíveis (Aprovado/Reprovado)
└── BoletimImpressor.java     # apresentação dos resultados
```

## Como compilar e executar

```bash
javac -d out src/escola/*.java
java -cp out escola.Sistema
```

## Melhorias aplicadas

- Nomes descritivos no lugar de `n`, `a`, `b` e `c`.
- Código modularizado: cada classe com uma única responsabilidade.
- Código auto comentado, sem comentários desnecessários.
- Padronização de nomes, indentação e organização dos arquivos em pacote.

## Respostas

**1. Qual era o principal problema do código original?**

Ele funcionava, mas era difícil de entender. Os nomes `n`, `a`, `b` e `c` não diziam
nada, o `6` aparecia solto no `if` e tudo estava dentro do mesmo `main`.

**2. Quais melhorias você realizou?**

Troquei os nomes por `nome`, `notas` e `media`, criei a constante
`MEDIA_MINIMA_PARA_APROVACAO` no lugar do `6`, separei o programa em classes com
uma responsabilidade cada e padronizei nomes, indentação e organização dos arquivos.

**3. Como a modularização facilitou a organização do código?**

Cada mudança passou a ter um lugar só. Mudou a nota de corte? Mexe em
`AvaliadorDeSituacao`. Mudou o que aparece na tela? Mexe em `BoletimImpressor`.
O `Sistema` ficou curto e mostra o fluxo inteiro de uma vez.

**4. Como o Git ajudou a controlar as alterações realizadas no sistema?**

O código original ficou salvo no primeiro commit, então dava para refatorar sem
medo de perder a versão que funcionava. As melhorias foram feitas em uma branch
separada, o Pull Request permitiu comparar o antes e o depois, e o histórico
registra o que mudou e por quê.
