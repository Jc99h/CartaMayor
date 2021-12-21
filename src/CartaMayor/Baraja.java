package CartaMayor;

public class Baraja
{
  private Carta[] listaCartas;

	public Baraja()
	{
		listaCartas = new Carta[]{ new Carta(1, "oros"),
															new Carta(2, "oros"),
															new Carta(3, "oros"),
															new Carta(4, "oros"),
															new Carta(5, "oros"),
															new Carta(6, "oros"),
															new Carta(7, "oros"),
															new Carta(10, "oros"),
															new Carta(11, "oros"),
															new Carta(12, "oros"),
															new Carta(1, "copas"),
															new Carta(2, "copas"),
															new Carta(3, "copas"),
															new Carta(4, "copas"),
															new Carta(5, "copas"),
															new Carta(6, "copas"),
															new Carta(7, "copas"),
															new Carta(10, "copas"),
															new Carta(11, "copas"),
															new Carta(12, "copas"),
															new Carta(1, "espadas"),
															new Carta(2, "espadas"),
															new Carta(3, "espadas"),
															new Carta(4, "espadas"),
															new Carta(5, "espadas"),
															new Carta(6, "espadas"),
															new Carta(7, "espadas"),
															new Carta(10, "espadas"),
															new Carta(11, "espadas"),
															new Carta(12, "espadas"),
															new Carta(1, "bastos"),
															new Carta(2, "bastos"),
															new Carta(3, "bastos"),
															new Carta(4, "bastos"),
															new Carta(5, "bastos"),
															new Carta(6, "bastos"),
															new Carta(7, "bastos"),
															new Carta(10, "bastos"),
															new Carta(11, "bastos"),
															new Carta(12, "bastos")};
	}


	/**
	 * Metodo que devuelve la lista de cartas
	 * @return listaCartas
	 */
	public Carta[] getListaCartas()
	{
		return listaCartas;
	}
}
