/* Fazer um programa para medir os reflexos do usuário. O programa deve:
·  Mostrar a palavra “Agora!” após um tempo aleatório e um número,
também aleatório
·  Contar o tempo até que o usuário digite o número pedido e mostrar esse
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
			System.out.println("Atenção, prepare seus reflexos.");
			System.out.println("Digite o número que aparecer na tela após a palavra 'agora' o mair rápido possível.");
			Reflexos.aleatorio();
			Instant tempoInicial = Instant.now();
			int num = sc.nextInt();
			Instant tempoFinal = Instant.now();
			Reflexos.tempoDecorrido(tempoInicial, tempoFinal);

		}	
	}
}
