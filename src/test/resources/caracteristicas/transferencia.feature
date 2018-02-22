# language: pt
@ContaTestRunner
Funcionalidade: Transferencia de valor de uma determinada conta para outra
As regras do saque, devem ser aplicadas na transferencia.

Esquema do Cenario: Transferencia realizada com sucesso
	Dado a conta do titular "<dono_titular>" de saldo <saldo_titular>
	Dado a conta do favorecido "<dono_favorecido>" de saldo <saldo_favorecido>
	Quando o titular transferir o valor de <valor> para o favorecido
	Entao o saldo da conta do favorecido tera o saldo de <novo_saldo_favorecido>
	Entao o saldo da conta do titular tera o saldo de <novo_saldo_titular>
	
Exemplos:
|dono_titular|dono_favorecido|saldo_titular|saldo_favorecido|valor |novo_saldo_favorecido|novo_saldo_titular|               
|Batman      |Robin          |500          |100             |100   |200       				   |400               |	
|Thor        |Odin           |300          |50              |100   |150     	   			   |200               |
