## Classe Pessoa

Contém os seguinte atributos:

- Nome (String)
- Idade (inteiro)
- Peso (double)
- Altura (double)

A classe tem a responsabilidade de armazenar os valores passados e possui o método [isPreenchido()](#) que verifica se todos os atributos estão devidamente preenchidos.

## Classe Main

É responsável por criar 50 objetos do tipo Pessoa e adicionar a uma lista de Pessoas.
Possui os métodos [gerarPessoaAleatoria()](#) e [ordernarPessoas()](#), onde geram objetos aleatório e ordenam dado um parâmetro.

Os parametros aceitos por [ordernarPessoas()](#) são:

- "nome"
- "idade"
- "altura"
- "peso"

Qualquer parametro que não seja algum desses acima será lançado uma exceção.

