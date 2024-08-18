/*1. Crie uma função recursiva que exiba a quan�dade de dígitos de um número inteiro passado como
parâmetro:
O código deve trazer como comentários:
A condição de parada
Como escrever a função para o termo n em função do termo anterior*/
package controller;

public class ControllerDigitos {
	
	public ControllerDigitos() {
		super();
	}
	
	public int contaDigitos(int numero) {
		if((double) numero / 10 == 1 || (double) numero / 10 == -1) {
			return 2;//Quando o valor for 10, retorna 2 digitos para a soma dos digitos.
		} else if ((double) numero / 10 < 1 || (double) numero / 10 < -1) {
			return 1;//Quando o valor dividido por 10 for menor que 1, retorna 1 para a soma.
		} else {
			return 1 + contaDigitos(numero / 10);//Quando o valor for maior que 10, retorna 1 para a soma , mais a recursiva dividindo o numero por 10.
		}
	}
}
