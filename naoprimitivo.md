### Diferenças entre Dados Primitivos e não Primitivos

- A principal diferença: dados não primitivos podem receber métodos, enquanto primitivos não podem
- Exemplos de dados não primitivos: String, array, class e enum
- Dados primitivos (como int, float, char) não podem ter métodos aplicados

### Trabalhando com Strings

- String é um tipo de dado não primitivo usado para armazenar texto (como nomes)
- Strings são declaradas entre aspas duplas: `String nome = "Naruto Uzumaki";`
- Métodos podem ser aplicados usando a notação de ponto (ex: `nome.toUpperCase()`)

### Métodos para Manipulação de String

- `toUpperCase()` - converte todo o texto para letras maiúsculas (caixa alta)
- `toLowerCase()` - converte todo o texto para letras minúsculas (caixa baixa)
- Os métodos não alteram a variável original, mas retornam um novo valor

### Demonstrações Práticas

- Armazenando o resultado de um método em uma nova variável: `String nomeEmCaixaAlta = nome.toUpperCase();`
- Concatenação de strings para exibir mensagens: `"Esse texto está em caps lock: " + nomeEmCaixaAlta`
- Comparação com dados primitivos (int) que não aceitam métodos

### Considerações Importantes

- É uma boa prática usar nomes em inglês para variáveis, mas não é obrigatório no início do aprendizado
- Ao concatenar strings, lembre-se de adicionar espaços para evitar que palavras fiquem juntas

### link para o material disponibilizado pelo professor:

https://gist.github.com/andersonbuenos/91b7480c8d78a34c82476d96b62d346b