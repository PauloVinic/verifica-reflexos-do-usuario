/* Fazer um programa para medir os reflexos do usu�rio. O programa deve:
�  Mostrar a palavra �Agora!� ap�s um tempo aleat�rio e um n�mero,
tamb�m aleat�rio
�  Contar o tempo at� que o usu�rio digite o n�mero pedido e mostrar esse
tempo.*/

package application;

import java.time.Instant;
import java.util.Locale;
import java.util.Scanner;

import entities.Reflexos;

public class Program {

	public static void main(String[] args) throws InterruptedException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Aten��o, prepare seus reflexos.");
			System.out.println("Digite o n�mero que aparecer na tela ap�s a palavra 'agora' o mair r�pido poss�vel.");
			Reflexos.aleatorio();
			Instant tempoInicial = Instant.now();
			int num = sc.nextInt();
			Instant tempoFinal = Instant.now();
			Reflexos.tempoDecorrido(tempoInicial, tempoFinal);

		}	
	}
}
