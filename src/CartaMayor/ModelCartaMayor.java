package CartaMayor;

import java.util.Random;

public class ModelCartaMayor
{
  private Baraja baraja;

	public ModelCartaMayor()
	{
		baraja = new Baraja();
	}

	/**
	 * Metodo que devuelve una carta
	 * @return carta
	 */
	public Carta devolverCarta()
	{
		int cara;
		Random aleatorio = new Random();
		cara = aleatorio.nextInt(40);
		return baraja.getListaCartas()[cara];
	}

	/**
	 * Metodo que devuelve el valor de una carta, la carta previamente devuelta por la funcion devolverCarta()
	 * @return entero
	 */
	public int devolverValorCarta()
	{
		return devolverCarta().getValorNumerico();
	}

	public String devolverValorPalo()
	{
		return devolverCarta().getValorPalo();
	}
}
