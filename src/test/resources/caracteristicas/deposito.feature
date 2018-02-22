# language: pt
@ContaTestRunner
Funcionalidade: Deposito de um determinado valor da conta

Esquema do Cenario: Deposito realizado com sucesso
	Dado uma conta com o titular "<dono>" de numero <numero> com o limite <limite> e saldo <saldo>
	Quando o for realizado um deposito no valor de <deposito> na conta
	Entao o saldo da conta sera <saldo_esperado>
	
Exemplos:
|dono  |numero|saldo|limite|deposito|saldo_esperado|
|Batman|1     |500  |100   |600     |1200					 |	
|Thor  |2     |300  |200   |500     |1000	   			 |
|Hulk  |3     |200  |300   |500     |1000					 |
|Jojo  |4     |100  |500   |600     |1200					 |
|Heitor|5     |1000 |1000  |500     |2500					 |