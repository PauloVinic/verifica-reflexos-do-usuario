package entities;

import java.time.Instant;
import java.util.Random;

public class Reflexos {
	
	public static void aleatorio() throws InterruptedException {
		Random random = new Random();
		int tempo = random.nextInt(10000) + 1000;
		int numero = random.nextInt(100);
		Thread.sleep(tempo);
		System.out.println("Agora: " + numero);
		}
	
	public static void tempoDecorrido(Instant tempoInicial, Instant tempoFinal) {
		long tempoDecorrido = (tempoFinal.toEpochMilli() - tempoInicial.toEpochMilli());
		Double tempoDecorridoSegundos = (double) (tempoDecorrido /1000.0);
		System.out.println("Você levou " + tempoDecorridoSegundos + " segundos para responder.");
	}
	
}
