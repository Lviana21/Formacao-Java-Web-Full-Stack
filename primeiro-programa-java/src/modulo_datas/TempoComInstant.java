package modulo_datas;

import java.time.Duration;
import java.time.Instant;

public class TempoComInstant {

	public static void main(String[] args) throws InterruptedException {
		
		//Class Instant � utilizado para saber quando tempo demora para um proceso ser executado
		Instant inicio = Instant.now();
		
		Thread.sleep(500);/*Pode ser um processo com tempo qualquer que n�o conhecemos*/
		
		Instant ifinal = Instant.now();
		
		Duration duracao = Duration.between(inicio, ifinal);
		
		System.out.println("Dura��o em nano segundos: " + duracao.toNanos());
		
		System.out.println("Dura��o em minutos: " + duracao.toMinutes());
		
		System.out.println("Dura��o em horas: " + duracao.toHours());
		
		System.out.println("Dura��o em milisegundos: " + duracao.toMillis());
		
		System.out.println("Dura��o em milisegundos: " + duracao.toDays());
		
	}
	
}
