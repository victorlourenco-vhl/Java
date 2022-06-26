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
  

## Tipos Primitivos
![image](https://user-images.githubusercontent.com/78964459/174917143-732f0782-9758-4764-8941-f5b2adf42596.png)

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
