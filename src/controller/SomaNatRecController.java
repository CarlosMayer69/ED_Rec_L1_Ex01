/*
1. Criar uma aplica��o em Java que tenha uma fun��o recursiva que 
calcule o somat�rio dos N primeiros n�mero NATURAIS 
(a fun��o deve retornar zero para n�meros negativos).
O C�digo deve apresentar, em formato de coment�rio, 
como foi definida a condi��o de parada;
O C�digo deve apresentar, em formato de coment�rio, 
como foi definida a rela��o de chamada dos passos.
*/

package controller;

public class SomaNatRecController {
	
	public SomaNatRecController() {
		super();
		
	}
	
public int somaNaturais(int limite) {
		
		//Condi��o de Parada
		//if(limite == 0) {Conforme enunciado do exerc�cio, temos que mudar!
		//Por causa dos negativos! Digitou 0 ou negativo, segue o jogo!
		  if(limite <= 0) {
			return 0;
		} else {
			int proximo = limite - 1;	
			return limite + somaNaturais(proximo);
		}
	}

}

/* An�lise l�gica:
 * somatorio(5) = 5 + somatorio(4) = 5 + 10 = 15
 * somatorio(4) = 4 + somatorio(3) = 4 + 6 = 10
 * somatorio(3) = 3 + somatorio(2) = 3 + 3 = 6
 * somatorio(2) = 2 + somatorio(1) = 2 + 1 = 3
 * somatorio(1) = 1 + somatorio(0) = 1 + 0 = 1
 * somatorio(0) = 0
 */