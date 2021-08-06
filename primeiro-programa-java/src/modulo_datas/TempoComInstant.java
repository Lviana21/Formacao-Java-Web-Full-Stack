package modulo_datas;

import java.time.Duration;
import java.time.Instant;

public class TempoComInstant {

	public static void main(String[] args) throws InterruptedException {
		
		//Class Instant é utilizado para saber quando tempo demora para um proceso ser executado
		Instant inicio = Instant.now();
		
		Thread.sleep(500);/*Pode ser um processo com tempo qualquer que não conhecemos*/
		
		Instant ifinal = Instant.now();
		
		Duration duracao = Duration.between(inicio, ifinal);
		
		System.out.println("Duração em nano segundos: " + duracao.toNanos());
		
		System.out.println("Duração em minutos: " + duracao.toMinutes());
		
		System.out.println("Duração em horas: " + duracao.toHours());
		
		System.out.println("Duração em milisegundos: " + duracao.toMillis());
		
		System.out.println("Duração em milisegundos: " + duracao.toDays());
		
	}
	
}
