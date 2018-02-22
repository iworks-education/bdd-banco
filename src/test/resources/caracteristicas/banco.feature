@BancoTestRunner
Feature: Testar as operacoes basicas de banco
  O sistema deve prover operações básicas de banco de forma correta.
  
  Background: Cria todas as contas e associa ao banco
    Given que as contas sao do "Banco do Brasil"
      | dono                       | numero | saldo |limite|
      | Peterson Larentis          | 379    | 200   |0		 |
      | Jorge Perillo              | 351    | 800   |0		 |
      | Heitor Roriz               | 555    | 9000  |0		 |
  
  Scenario: Verifica o total de contas criadas
    Given  o calculo do total de contas criadas
    Then  o total de contas e 3
  
  Scenario: Verifica o total de dinheiro no banco
    Given o calculo do total de dinheiro
    Then o total de dinheiro no banco e 10000