# language: pt
@ContaTestRunner
Funcionalidade: Saque de um determinado valor da conta
Regras: O Saldo disponível da conta é composto pelo saldo atual mais o limite, 
portanto um saque pode ser realizado caso seja menor ou igual ao saldo mais limite.

Esquema do Cenario: Saque realizado com sucesso
	Dado uma conta do dono "<dono>" de numero <numero> com o limite <limite> e saldo <saldo>
	Quando o dono realizar o saque no valor de <saque> na conta
	Entao o dono tera o saldo no valor de <saldo_esperado> na conta
	
Exemplos:
|dono  |numero|saldo|limite|saque|saldo_esperado|
|Batman|1     |500  |100   |600  |0							|
|Thor  |2     |300  |200   |500  |0							|
|Hulk  |3     |200  |300   |500  |0							|
|Jojo  |4     |100  |500   |600  |0							|
|Heitor|5     |1000 |1000  |500  |1500					|