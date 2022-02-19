### O que é Teste de Software ?

Teste de Software é um processo que faz parte do ciclo de vida do software, e tem como principal objetivo avaliar a qualidade do software e reduzir o risco de falha no software em opeção.



### O que são bug ?

Os bugs são invitáveis no desenvolvimento de um produto. Por issom existem diversas técnicas de desenvolvimento e processos de controle de qualidade realizados durante o ciclo de desenvolvimento de software que buscam evitar que um erro afete a experiência e confiança do usuário na aplicação.

A desculpa de não se testar o software, é que teste custa caro, mas Pressman já apresentou em seu Livro de Engenharia de Software que o custo do defeito é progressivo, ou seja, ecnontrar o defeito na fase de engenharia de requisitos custa 1 equanto encontrar o defeito durante a fase de produção - fase de entrega do software ao usuário final -  custa 100 vezes mais, então utilizar o teste, reduz e não aumenta.

### 

### Princípios de Testes de Software

* O Teste mostra a presença de defeitos e não sua ausência
* Testes exaustivos são inpossíveis
* O teste inicial economiza tempo e dinheiro
* Cuidade com o paradoxo do pesticida
* O teste depende do contexto
* Ausência de erros é uma ilusão



### Teste de Software

Tipos de Teste:

* Teste de Funcionalidade
* Teste de Usabilidade
* Teste de Performance
* Teste de Segurança

Técnicas de Teste:

* Teste Funcional (Black-Box)
* Teste Estrutural(White-Box)

Níveis de Teste:

* Teste de Unidade
* Teste de Integração
* Teste de Sistema
* Teste de Aceitação(Visão de Cliente)

____

### Processo de Teste

* Planejar
  * Técnicas de Testes:	
    * Partição do Valor Limite(Equivalence Partition)
    * Análise do Valor Limite(Boundary value Analysis))
    * Tabela de Decisão(Decision Table)
    * Testes por Transição de Estados(State Transitioning Testing)
  * Leitura dos requisitos -> Levantamendo de dúvidas -> Ideias de teste -> Estimativa	
    * Estratégia, Plano de Teste, Cenários Básicos
* Projetar
  * Nome/Titulo; Objetivo; Pré-condições; Passo a Passo; Resultado esperado
    * Elaborar Casos de Teste, Técnicas de Testes
* Executar
  * BUGs, Execução de Testes,Evidências de Testes
* Entregar
  * Evidências de Testes,  Status Resports, Documentação(caso de testes / Script de Teste)



### Testes Estáticos

Checklist de Epecificação de Requisitos:

* Verificação de diagramas;
* Código;
* Plano de Teste;
* Especificação de Testes;
* Script de Teste;
* Manual de Usuário;



### Análise do Valor Limite

O "Valor Limite" (bordas extremas de uma partição) são uma área em que os testes podem gerar defeitos. Os testes podem ser desenhados para cobrir tanto os valores válidos, quando os inválidos.

Deve ser feito um caso de teste para cada valor limite.

A técnica é executada da seguinte forma:

1. Indentificar as partições equivalentes e os ranges de valores relacionados.
2. Indentificar os valores máximos e mínimos(resultandoempartições válidas e inválidas).
3. Desenvolver as condições de testes para cada valor limite indentificado.

Variações dessa técnica podem identificar trẽs valores de limite por limite de dados:

* O valor anterior ao limite;
* O próprio valor limite;
* E imediatamente superior a ele;



### Tabela de Decisão

Uma tabela de decisão ajuda  a testar regras de negócios sobre varias condições do sistema(input do usuário) e as ações correspondentes(system outputs).

A técnica de Tabela de Decisão analisa essencialmente dois parâmetros;

* Condições
* Ações



### Transição de Estados

Diagramas de Transição de estados, são utilizados no design da aplicação para representar o comportamento de um sistema em um número finito de estados.

Estes diagramas são extremamente úteis em situações onde a análise e testes de sistema são requeridos utilizando como base o comportamento/situação anterior da aplicação com o que está ocorrendo no presente.

A transição é iniciada por um evento (usuário inseriu valor em um campo).

O envento resulta em uma transição.

A mudança de estado pode fazer com que o software execute uma ação (gerar mensagem de cálculo ou de erro).

A transão é iniciada por um evento(entrada de um valor em um campo;

O evento resulta em uma transição;

A mudança de estatdo pode fazer com que o software execute uma ação(gerar uma mensagem de cálculo ou de erro)).

### Técnicas de Testes Baseadas na Experiência

##### Suposição de erro

* Como o aplicativo funcionou no passado;

* Quais tipos de erros os desenvolvedores tendem a fazer;
* Falhas ocorridas em outros aplicativos;

##### Test exploratório

* Sem um roteiro previamente definido. São modelados, executados, registrados e avaliados dinamicamnte durante a execução de teste.

### Executar

O que uma boa evidência deve ter ?

| Evidências de Erro                                      | Evidências de Sucesso                            |
| ------------------------------------------------------- | ------------------------------------------------ |
| `Print do erro`                                         | `Print do resultado esperado`                    |
| `Descrição do passo a passo de como chegar ao problema` | `Nome ou id do caso de teste`                    |
| `Descrição do erro mostrado na tela`                    | `Data da execução e versão do sistema realizado` |
| `Navegador, sistema operacional usado`                  | `Ciclo do teste`                                 |
| `Versão do sistema testado`                             |                                                  |



### Quando para os testes ? 

Quando atigin uma confiança no requisitos, quando os critérios de encerramento forem atingidos ou quando os custos para identificação dos defeitos não compensam mais.

A cultura de se testar o software pode ou tem algumas barreiras como:

* Tempo Insuficiente;
* Orçamento curto;
* Falta de capacitação para identificar risco;
* Falta de capacitação dos desenvolvedores para executar ao menos um teste unitário;

____

### Conceitos de Junit4



### Asserts

 São metodos utilitário 

* Afirmação
* Assertions para tipos primitivos,  Objetos e arrays
* Import static
* Ordem dos parâmetros



### Rules

* O que é ?

* Interface TestRule
* O que fazer ?



### Testando Exceções

* Exceções esperadas
* Exceções esperadas Rules
* Try/Catch idiom



### Mocks

- Objetos Mock, objetos simulados ou simplesmente Mock.
- Razões para usar: Criar/simular objetos reais para testes é dificl
- Limitações: Tipos primitivos, Objetos e Arrays

Frameworks:

* Mockito

```java
public class MockitoTest{
	
	public void test(){
		List mock = mock(List.class);
		
		when(mock.get(0).thenReturn("one"));
		when(mock.get(1).thenReturn("two"));
		
		//someCodeThatInteractWithMock();
		verify(mock).clear();
	}
}
```

* EasyMock

```java
public class EasyMockTest{
	
	public void test(){
		List mock = createNiceMock(List.class);
		
		expect.(mock.get(0)).andStubReturn("one");
		expect.(mock.get(0)).andStubReturn("two");
		mock.clear();
		
		replay(mock);
		
		//someCodeThatInteractsWithMock();
		
		verify(mock);
	}
}
```

* PowerMockito



### Hamcrest e Matcher

- Hamcrest
  - Definição
  - Setup
  - Exemplo

* Matcher
  * Object Matcher
  * Bean Matcher
  * Collection Matcher
  * Number Matcher
  * Text Matcher

____

### Junit 5

| Annotaion             | Description                                                  |
| --------------------- | ------------------------------------------------------------ |
| `@Test`               | Denotes that a method is a test method. Unlike JUnit4's @Test annotation, this annotation does not declare any attributes, sice test extensions in JUnit Upiter operate based on their own dedicated annotations. Such methods are inherited unless they are overridden |
| `@ParamenterizedTest` | Denotes that a method is a parameterized test. Such methods are inherited unless they are overriden. |
| `@RepestedTest`       | Denotes that a method is a test template for a repeated test. Such methods are inherited unless they are overidden |
| `@TestTemplate`       | Denotes that a method is a template for test cases designed to be invoked multiple times depending on the number of invocation contexts returned by the registered providers. Such methods are inherited unless they are overridden. |
| `@TestMethodOrder`    | Used to configure the test method execution order for the annoted test class; similar to JUnit @FixMethodOrder. Such annotations are inherited. |

```java
@Test
void lambdaExpressions(){
    assertTrue(stream.of(1,2,3)
              .stream()
              .mapToInt(i -> i)
              .sum() > 5, () -> "Sum should be greater than 5");
}
```

```java
@Test
void groupAssertions(){
	int[] numbers = {0, 1, 2, 3, 4};
    assertAll("numbers",
             () -> assertEquals(numbers[0], 1)
             () -> assertEquals(numbers[3], 3)
             () -> assertEquals(number[4], 1)
             );
}
```

