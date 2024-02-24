/*
1. Criar uma aplicação em Java que tenha uma função recursiva que 
calcule o somatório dos N primeiros número NATURAIS 
(a função deve retornar zero para números negativos).
O Código deve apresentar, em formato de comentário, 
como foi definida a condição de parada;
O Código deve apresentar, em formato de comentário, 
como foi definida a relação de chamada dos passos.
*/

package controller;

public class SomaNatRecController {
	
	public SomaNatRecController() {
		super();
		
	}
	
public int somaNaturais(int limite) {
		
		//Condição de Parada
		//if(limite == 0) {Conforme enunciado do exercício, temos que mudar!
		//Por causa dos negativos! Digitou 0 ou negativo, segue o jogo!
		  if(limite <= 0) {
			return 0;
		} else {
			int proximo = limite - 1;	
			return limite + somaNaturais(proximo);
		}
	}

}

/* Análise lógica:
 * somatorio(5) = 5 + somatorio(4) = 5 + 10 = 15
 * somatorio(4) = 4 + somatorio(3) = 4 + 6 = 10
 * somatorio(3) = 3 + somatorio(2) = 3 + 3 = 6
 * somatorio(2) = 2 + somatorio(1) = 2 + 1 = 3
 * somatorio(1) = 1 + somatorio(0) = 1 + 0 = 1
 * somatorio(0) = 0
 */