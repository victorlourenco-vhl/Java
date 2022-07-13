# Java ☕

- Compilador: Transforma o código fonte em código executável
- A linguagem C foi importante para criar códigos que rodam em múltiplas plataformas.
- C++: O ++ se refere a orientação a objetos

- Tipos de linguagens:
  - Compiladas
  - Interpretadas
  - Híbridas

![image](https://user-images.githubusercontent.com/78964459/174917465-fdc2e254-684c-4edb-a201-f50abe397bdb.png)

## Funcionamento do Java

- O Java é compilado pelo JavaC (compilador do Java), gera um bytecode que irá poder rodar em qualquer plataforma que tenha JVM (Java Virtual Machine) e rodará em qualquer plataforma.
    - Isso tudo se chama WORA - Write Once Run Anywhere
    - **JRE** - Java Runtime Environment (Ambiente de Tempo de Execução Java)
        - JVM
            - Loader / Verificador
            - Interpretador / Gerenciador
            - Compilador JIT - Just In Time (Compilador em tempo real)
        - Bibliotecas
    - **JDK** - Java Development Kit
        - JRE
        - JavaLang
        - JavaTools
            - JavaC
            - Debugger
            - API’ss
        
     - **Obs:** Edições do JDK
        
        - SE - Standard Edition
            - Quando quer utilizar aplicativos em janelas
        - EE - Enterprise Edition
            - Aplicações como muitos recursos para grandes empresas
        - ME - Micro Edition
            - Aplicação para dispositivos portáteis

## Camel Case

- Primeira letra maiúscula:
    - MinhaClasse - Classe / Interface
- Primeira letra minúscula o restante maiúscula pode ser:
    - meuAtributo
    - minhaVariável
    - meuMétodo
- Todas as letras minúsculas:
    - meu_pacote
- Todas as letras maiúsculas:
    - CONSTANTES

## Outras Convenções
- **Camel Case:** lastName
  - pacotes
  - atributos
  - métodos
  - variáveis e parâmetros

- **Pascal Case:** ProductsService
  - classes

## Tipos Primitivos
![image](https://user-images.githubusercontent.com/78964459/174917143-732f0782-9758-4764-8941-f5b2adf42596.png)

- Restrições para nomes de variáveis
  - Não pode começar com dígito: usar letra ou _
  - Não usar acentos ou til
  - Não pode ter espaço em branco
  - **Obs:** Usar nomes que tenham significado

- Marcadores para utilizar com o **printf**
  - %f = ponto flutuante
  - %d = inteiro
  - %s = texto
  - \n | %n = quebra de linha

## Principai funções matemáticas

- A = **Math.sqrt(x);**
  - variável A recebe raiz quadrada de x
- A = **Math.pow(x, y);** 
  - Variável A recebe o resultado de x elevado a y
- A = **Math.abs(x);** 
  - Variável A recebe o valor absoluto de x (valor sem o negativo)

## Expressão condicional ternária
- (condição)? valor_se_verdadeiro : valor_se_falso

## Operadores Bitwise
- **&** - Operação **E** bit a bit
- **|** - Operação **OU** bit a bit
- **^** - Operação **OU-Exclusivo** bit a bit

## Classe
- É um tipo estruturado que pode conter (membros):
  - Atributos (dados/campos)
  - Métodos (funções/operações)

- A classe também pode prover muitos outros recursos, tais como:
  - Construtores
  - Sobrecarga
  - Encapsulamento
  - Herança
  - Polimorfismo

- Exemplos: 
  - Entidades: Produto, Cliente, Triângulo
  - Serviços: ProdutoService, ClienteService, EmailService, StorageService
  - Controladores: ProdutoController, ClienteController
  - Utilitários: Calculadora, Compactador
  - Outros (views, repositórios, gerenciadores, etc.)

- **Obs:** Toda classe Java é uma subclasse da classe Object
- **Obs:** Não é possível chamar um método que não seja estático dento de um método que já é estático
- Método estático: Não precisa de instância para ser utilizado

- Object possui os seguintes métodos: 
  - getClass - retorna o tipo do objeto
  - equals - compara se um objeto é igual ao outro
  - toString - converte o objeto para string

### Classes | Objetos | Atributos
- Clase: é a definição do tipo
- Objetos: São instâncias da classe

## Construtor
- É executado no momento da instanciação do objeto 
- Casos de uso:
  - Iniciar valores dos atributos
  - Permitir ou obrigar que o objeto receba dados / dependências no memento da instanciação (injeção de dependência)
- **Obs:** É possível iniciar mais de um construtor na mesma classe (sobrecarga)

## This
- Serve para se referenciar a um atibuto do objeto

## Sobrecarga
- É um recurso que uma classe possui de oferecer mais de uma operação/método com o mesmo nome, porém com diferentes listas de parâmetros

## Encapsulamento
- Serve para controlar o acesso aos atributos e métodos de uma classe, expondo apenal operaçãoes segura e que mantenham o objeto em um estado consistente
- **Obs:** um objeto não deve expor nenhum atributo (modificador de acesso private). Deve utilizar get e set
  - Referência: https://en.wikipedia.org/wiki/JavaBeans

## Modificadores de acesso
- Private
  - O membro só pode ser acessado na **própria classe**
- (nada)
  - O membro só pode ser acessado nas classes do **mesmo pacote**
- Protected
  - O membro só óde ser acessado no **mesmo pacote**, bem como em **subclasses de pacotes diferentes**
- public: O membro é acessado por todas classes(ao menos que ele resida em um módulo diferente que não exporte o pacote onde ele está)
  
## Memória

### Classes são tipos referência
- Variáveis cujo tipo são classes não devem ser entendidas como caixa, mas sim "tentáculos"(ponteiros) para caixas
- **Stack** - Área de memória que aloca as variáveis declaradas
- **Heap** - Área da memória em que são alocados os objetos em tempo de execução (alocação dinâmica de memória)
- Se **p2 = p1** e ambas são variáveis do tipo classe, as duas vão apontar para o mesmo endereço de memória.

### Tipos Primitivos são tipos valor 
- Em Java, tipos primitivos são tipos valor. Tipos valor são caixas e não ponteiros
- Se **X = Y** então X recebe uma cópia do valor de Y

### Valores padrão
- quando alocar (new) qualquer tipo estruturado (classe ou array), são atribuídos valores padão aos seus elementos
  - números: 0
  - boolean: false
  - char: caractere código -
  - objeto: null

### Garbage collector
- É um processo que automatiza o gerenciamnto de memória de um programa em execução
- O garbage collector monitora os objetos alocados dinamicamente pelo programa (no heap), desalocando aqueles que não estão mais sendo utilizados. 


### Tópicos importantes sobre alocação de memória
- Objetos alocados dinamicamente, quando não possuem mais referências para eles, serão desalocados pelo garbage collector
- Variáveis locais são desalocadas imediatamente assim que seu escopo local sai de execução

### Vetores
- Em programação, "vetor" é o nome dado a arranjos unidimensionais
- Arranjo (array) é uma estrutura de dados
  - Homogênea (dados do mesmo tipo)
  - Ordenada (elementos acessados por meio de posições)
  - Alocada de uma vez só, em um bloco contínuo de memória
- Vantagens
  - Acesso imediato aos elementos pela posição
- Desvantagens
  - Tamanho fixo
  - Dificuldade para se realizar inserções e deleções

## Boxing, unboxing e wrapper classes
- **Boxing:** Conversão de um objeto tipo valor para  um objeto tipo referência compatível (Encaixotamento da variável)
- **Unboxing:** É o preocesso de conversão de um objeto tipo referência para um objeto tipo valor compatível
- **Wrapper classes**
  - São classes equivalentes aos tipos primitivos
  - Boxing e unboxing é natural na linguagem (não precisa de casting)
  - Uso comum: campos de entidades em sistemas de informação (**IMPORTANTE**)
    - Tipos refêrencia (classes) aceitam valor null e usufruem dos recursos OO

## for each
- Sintaxe opcional e simplificada para percorrer coleções
- for (**TIPO** **APELIDO** : **COLEÇÃO**){ **COMANDO**}

## Listas
- Lista é uma estrutura de dados: 
  - Homogênea (dados do mesmo tipo)
  - Ordenada (elementos acessados por meio de posições)
  - Inicia vazia, e seus elementos são alocados so demanda
  - Cada elemento ocupa um "nó" (ou nodo) da lista
  - **Obs:** cada nodo tem um ponteiro para o próximo nodo
  - **Obs: 2** A lista só aceita declaração utilizando wrapper class
  
-  Tipo (interface): List
  - Classe que implementam: ArrayList, LinkedList, etc
  
- Vantagens
  - Tamanho variável
  - Facilidade para se realizar inserções e deleções
  
- Desvantagens
  - Acesso sequencial aos elementos* (depende de como a lista é implementada)
  
- **Principais parâmetros**
  - Tamanho da lista: size()
  - Inserir elemento na lista: add(obj), add(int(posicao), obj);
  - Remover elementos da lista: remove(obj), remove(int(posicao)), removeIf(Predicate)
  - Encontrar posição do elemento: indexOf(obj), lastIndexOf(obj)
  - Filtrar lista com base em predicado
  ```
    List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
  ```
  - Encontrar primeira ocorrência com base em predicado
  ```
    String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
  ```

## Matrizes
- Em programaçã, "matriz" é o nome dado a arranjos bidimensionais
  - **Obs:** "vetor de vetores"
- Arranjo (array) é uma estrutura de dados
  - Homogênea (dados do mesmo tipo)
  - Ordenada (elementos acessados por meio de poisições)
  - Alocada de uma vez só, em um bloco contínuo de memória
- Vantagens
  - Acesso imediato aos elementos pela sua posição
- Desvantagens
  - Tamanho fixo
  - Dificuldade para se realizar inserções e deleções
 

  
  
  
  
  



