# POOA-T2

## Desenvolvimento

O projeto [openClosedPrinciple4][ocp4] foi usado como base para desenvolver esse trabalho.

Os seguintes vídeos foram usados como referência:
* [Ferramenta simples para download de títulos de notícias][ocp4_video]
* [Princípios SOLID na programação orientada a objetos - Princípio Aberto-Fechado - parte 1][ocp_video1]
* [Princípios SOLID na programação orientada a objetos - Princípio Aberto-Fechado - parte 2][ocp_video2]
* [Padrao Strategy][strategy_video]

## Princípio Aberto-Fechado

Para alcançar o objetivo de construir uma ferramenta capaz de baixar títulos das notícias do dia, respeitando os princípios aberto-fechado e de responsabilidade única, optou-se por empregar o padrão de design Strategy.

O diagrama de classes a seguir demonstra a estrutura dessa aplicação:

![ALT TEXT](https://github.com/Igz72/POOA-T2/blob/main/img/DiagramaDeClasses.png)

Os pacotes `site` e `output` adicionam, cada um, uma classe abstrata que deve ser herdada para a definição de novos sites de notícia e estratégias de saída, respectivamente.

[ocp4]: <https://github.com/Igz72/LinguagemSimples/wiki#linguagemsimples-wiki>
[ocp4_video]: <https://www.youtube.com/watch?v=HOKhJT7Hp1A>
[ocp_video1]: <https://www.youtube.com/watch?v=U809piivK5s>
[ocp_video2]: <https://www.youtube.com/watch?v=bph8-sqIZLc>
[strategy_video]: <https://www.youtube.com/watch?v=yf0sdwQAWhQ>
