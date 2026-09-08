# boas-praticas-software

Sistema simples de calculo de media escolar, utilizado para praticar boas praticas
de desenvolvimento de software.

## Estrutura

```
src/escola/
├── Sistema.java              # ponto de entrada, apenas orquestra o fluxo
├── Aluno.java                # dados do aluno (nome e notas)
├── CalculadoraDeMedia.java   # calculo da media
├── AvaliadorDeSituacao.java  # regra de aprovacao/reprovacao
├── SituacaoAcademica.java    # situacoes possiveis (Aprovado/Reprovado)
└── BoletimImpressor.java     # apresentacao dos resultados
```

## Como compilar e executar

```bash
javac -d out src/escola/*.java
java -cp out escola.Sistema
```

## Melhorias aplicadas

- Nomes descritivos no lugar de `n`, `a`, `b` e `c`.
- Codigo modularizado: cada classe/metodo com uma unica responsabilidade.
- Codigo auto comentado, sem comentarios desnecessarios.
- Padronizacao de nomes, indentacao e organizacao dos arquivos em pacote.
