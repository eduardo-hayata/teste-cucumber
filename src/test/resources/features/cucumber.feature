# language: pt
@unitarios
Funcionalidade: Cucumber 
  Como um usuario
  Eu quero aprender Cucumber
  Para que eu possa automatizar Criterios de Aceitacao

#Cenario 1
Cenario: Deve excutar especificacao
  Dado que criei o arquivo corretamente
  Quando executa-lo
  Entao deve finalizar com sucesso
  
#Cenario 2
Cenario: Incrementar contador
  Dado que o valor do contador eh 10
  Quando eu incrementar em 5
  Entao o valor do contador sera 15
  
#Cenario 3
Cenario: Incrementar contador
  Dado que o valor do contador eh 100
  Quando eu incrementar em 100
  Entao o valor do contador sera 200
  