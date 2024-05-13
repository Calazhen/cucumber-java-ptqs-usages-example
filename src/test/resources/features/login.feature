#language:pt

Funcionalidade: Login

#  User Story:
#  Como usuário Admin e Henrique
#  Eu quero logar na lojinha
#  Para começar a utilzar minha conta

  @ExemploLogin
  Cenario: Realizar Login com sucesso
    Dado que esteja na pagina da login
    Quando o login for realizado com os seguintes dados
      | usuario | admin |
      | senha   | admin |
    Entao valido que o login foi realizado

  @ExemploLoginComEsquema
  Esquema do Cenario: Realizar Login com <usuario>
    Dado que esteja na pagina da login
    Quando o login for realizado com os seguintes dados
      | usuario | <usuario> |
      | senha   | <senha>   |
    Entao valido que o login foi realizado

    Exemplos:
      | usuario          | senha          |
      | admin            | admin          |
      | Henrique No PTQS | Henriquenoptqs |


