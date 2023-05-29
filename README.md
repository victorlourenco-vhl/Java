# Java ☕

- Compilador: Transforma o código fonte em código executável
- A linguagem C foi importante para criar códigos que rodam em múltiplas plataformas.
- C++: O ++ se refere a orientação a objetos

- Tipos de linguagens:
  - Compiladas
  - Interpretadas
  - Híbridas

<p align='left'>
<img src="https://user-images.githubusercontent.com/78964459/174917465-fdc2e254-684c-4edb-a201-f50abe397bdb.png"/>
</p>
  
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
- É uma estrutura que abstrai um conjunto de objetos com características similares. Além disso, uma classe define o comportamento de seus objetos através de métodos e os estados possíveis através de atributos
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

![image](https://user-images.githubusercontent.com/78964459/179416683-ea6db1b8-b177-4b90-b346-e5f50b29424e.png)

  
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
 
## Enumerações
- É um tipo especial que serve para especificar de forma literal um conjunto de constantes que estão relacionadas
- Palavra chave em Java: enum
- Vatagem: melhor semântica, código mais legível e auxiliado pelo compilador

## Composição
- É um tipo de associação que permite que um objeto contenha outro
- Relação "tem-um" ou "tem-vários"
- Vantagens
  - Organização: divisão de responsabilidades
  - Coesão
  - Flexibilidade
  - Reuso
- **Obs:** O símbolo UML para composição (todo-parte) é o diamante preto

## Herança
- É um tipo de associação que permite uma classe herdar todos os dados e comportamentos de outra classe.
- Vantagens:
  - Reuso 
  - Polimorfismo
- Sintaxe:
  - class A extends B

### Upcasting 
- Casting da subclasse para superclasse
- Uso comum: polimorfismo

### Downcasting
- Casting da superclasse para subclasse
- Palavra instanceof
- Uso comum: métodos que recebem parâmetros genéricos (ex: Equals)

## Sobreposição ou sobrescrita
- É a implementação de um método de uma superclasse na subclasse
- É fortemente recomendável usar a anotação @Override em um método sobrescrito
  - Facilita a leitura e compreensão do código
  - Serve para avisar o compilador (boa prática)

## final
- **Classse**: evita que a classe seja herdada
- **Método**: evita que o método seja sobreposto
- Por quê usar ?
  - Segurança: Dendendo das regaras do negócio, às vezes é desejável garantir que uma classe não seja herdada
    - O **final** costuma ser aplicado em métodos sobrepostos, pois múltiplas sobreposições podem ser uma porta de entrada para inconsistências
  - Performace: atributos de tipo de uma classe final são analisados de forma mais rápida em tempo de execução
    - Exemplo: String

## Polismorfismo
- Comportamentos diferentes determinados em tempo execução

- **Definição formal**: Em Programação Orientada a Objetos, polimorfismo é recurso que
permite que variáveis de um mesmo tipo mais genérico possam
apontar para objetos de tipos específicos diferentes, tendo assim
comportamentos diferentes conforme cada tipo específico.

- **Importante**
  - A associação do tipo específico com o tipo genérico é feita em tempo de
execução (upcasting)
  - O compilador não sabe para qual tipo específico a chamada do método
Withdraw está sendo feita (ele só sabe que são duas variáveis tipo Account)

- É um princípio no qual duas ou mais classes derivadas podem invocar um método da superclasse que tenham a mesma assinatura mas comportamentos distintos, especializados para cada classe derivada. Desse modo, a sobrescrita ou sobreposição é um conceioto de **polimorfismo**


## Classes abstratas
- São classes que não podem ser instanciadas
- É uma forma de garantir herança total: somente subclasses não abstratas pode ser instanciadas, mas nunca a superclasse abstrata
- **Obs:** A notação de uma classe abstrata em UML é o nome da classe em itálico

## Métodos abstratos
- São métodos que não possuem implementação
- Métodos precisam ser abstratos quando a classe é genérica demais para conter sua implementação
- Se uma classe possuir pelo meno um método abstrat, então esta classe também é abstrata
- Notação UML: itálico

## Execeções
- Uma exceção é qualquer condição de erro ou comportamento inesperado encontrado por um programa em execução

- Em Java, uma exceção é um objeto herdado da classe:
  - java.lang.Exception - o compilador obriga a tratar ou propagar 
  - java.lang.RuntimeException - o compilador não obriga a tratar ou propagar

- Por que usar exceções? 
- O modelo de tratamento de exceções permite que erros sejam
tratados de forma consistente e flexível, usando boas práticas

- Vantagens:
  - Delega a lógica do erro para a classe responsável por conhecer as regras que
podem ocasionar o erro
  - Trata de forma organizada (inclusive hierárquica) exceções de tipos diferentes
  - A exceção pode carregar dados quaisquer

### Estrutura try-catch
- Bloco try
  - Contém o código que representa a execução normal do trecho de código que pode acarretar em uma exceção
- Boloco catch
  - Contém o código a ser executado caso uma exceção ocorra

### Stack Trace
- É uma pilha de chamada de métodos
- Quando ocorre uma exceção o stack trace vai rastrear todas as chamadas dos seus métos até chegar onde occoreu a execeção

### finnally
- É um bloco que contém código a ser executado independente de ter ocorrido ou não uma exceção
- Exemplo clássico: fechar um arquivo, conexão de banco de dados, ou outro recurso específico ao final do processamento

### Bloco try-with-resources
- É um bloco try que declara um ou mais recursos, e garante que esses recursos serão fechados ao final do bloco
  - Diponível a partir do Java 7

### Organização do programa por pacotes
![image](https://user-images.githubusercontent.com/78964459/181914891-c89ee9c8-705f-4a97-9130-db6bd2f3b259.png)

### RuntimeException e Exception
- Exception: O compilador obriga a tratar a exceção
- RuntimeException: O compilador não obriga a tratar

## Trabalhando com Arquivos
- **File:** Representação abstrata de um arquivo e seu caminho
- **Scanner:** Leitor de texto
- **IOException** herda de (Exception)

### Leitura 
- **FileReader** (stream de leitura de caractereres a  partir de arquivos)
  - **Obs:** stream em programação significa sequência ou fluxo
- **BufferedReader** É instanciado a partir do **FileReader** e implementa algumas otimizações utilizando o buffer de memória
```Java
String path = "c:\\temp\\in.txt";

try (BufferedReader br = new BufferedReader(new FileReader(path))) {

  String line = br.readLine();

  while (line != null) {
    System.out.println(line);
    line = br.readLine();
  }
} 
catch (IOException e) {
  System.out.println("Error: " + e.getMessage());
}
```

### Escrita
- FileWriter (stream de escrita de caracteres em arquivos)
  - Cria/recria o arquivo: **new FileWriter(path)**
  - Acrescenta ao arquivo existente: **new FileWriter(path, true)**
- BufferedWriter (mais rápido)
```Java
String[] lines = new String[] {"Bom dia", "Boa tarde", "Boa noite"};
		
String path = "c:\\temp\\out.txt";

try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
  for(String line : lines) {
    bw.write(line);
    bw.newLine();
  }
}
catch (IOException e) {
  e.printStackTrace();
}
```
## Interface
- Interface é um tipo em Java que define um conjunto de operações que uma classe deve implementar
- A interface estabelece um contrato que a classe deve cumprir
```Java
interface Forma{
  double are();
  double perimetro();
}
```
- Por quê interfaces?
  - Para criar ssistemas com **baixo acoplamento** e **flexíveis**

### Inversão de controle
- Padrão de desenvolvimento que consiste em retirar da classe a responsabilidade de instanciar suas dependências

### Injeção de dependência
- É uma forma de realizar a inversão de controle: um componente externo instancia a depenência, que é então injetada no objeto "pai". Pode ser implementada de várias formas: 	
  - Construtor
  - Classe de instanciação (builder / factor)
  - Container / framework
  
## Herança x Interface
- **Semelhanças**
  - Relação é-um
  - Generalização/especialização
  - Polimorfismo
  
- **Diferença**
  - Herança - Reuso
  - Interface - Contrato a ser cumprido

## Default methods (defender methods)
- A partir do Java 8, interfaces podem conter métodos concretos
- A intenção básica é prover implementação padrão para métodos, de modo a evitar:
  - Repetição de implementação em toda classe que implemente a interface
  - A necessidade de se criar classes abstratas para prover reuso da implementação

- Outras vantagens:
  - Manter a retrocompatibilidade com sistemas existentes
  - Permitir que "interfaces funcionais" (que devem conter apenas um método) possam prover outras operações padrão reutilizáveis

## Generics
- Generics permitem que classes, interfaces e métodos possam serm parametrizados por tipo. Seus benefícios são:
   - Reuso
   - Type safety
   - Performace
