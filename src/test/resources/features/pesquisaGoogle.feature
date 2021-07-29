# language: pt
@funcionais
Funcionalidade: Pesquisas usando o Google
  Como um usuario
  Eu quero fazer pesquisas
  Usando o Google
 
#Scenario Outline 1
Esquema do Cenario: Deve fazer pesquisas utilizando botão "Pesquisa Google"
  Dado que o usuario esta no site "<site>"
  Quando o usuario pesquisa "<assunto>"
  E o usuario clica no botao "<botao>"
  Entao mostra os resultados com sucesso 
  
Exemplos:
| site   | assunto  | botao           |
| google | Cucumber | Pesquisa Google |
| google | Selenium | Pesquisa Google |
| google | Java     | Pesquisa Google |


#Scenario Outline 2
Esquema do Cenario: Deve fazer pesquisas utilizando botão "Estou com sorte"
  Dado que o usuario esta no site "<site>"
  Quando o usuario pesquisa "<assunto>"
  E o usuario clica no botao "<botao>"
  Entao mostra a "<url>" principal do assunto pesquisado
  
Exemplos:
| site   | assunto  | botao           | url                         |
| google | Cucumber | Estou com sorte | https://cucumber.io/        |
| google | Selenium | Estou com sorte | https://www.selenium.dev/   |
| google | Java     | Estou com sorte | https://www.java.com/pt-BR/ |




