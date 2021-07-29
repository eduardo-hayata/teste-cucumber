# language: pt
@funcionais
Funcionalidade: Login do Gmail
  Como um usuario
  Eu quero fazer login
  Usando o Gmail

#Cenario 1  
Cenario: Login sem email
  Dado que o usuario esta no Gmail
  Quando o usuario escreve o email vazio
  E o usuario clica no botao Proxima
  Entao aparece uma mensagem de erro
 

  
  