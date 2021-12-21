package CartaMayor;


/**
 * Class Carta create cartas
 * @author Camilo Ordoñez 1827625-2711 juan.ordonez.hurtado@correounivalle.edu.co
 * @version v.1.0.0 date 03/12/2021
 */

public class Carta
{
	private int valorNumerico;
	private String valorPalo;

	public Carta(int _valorNumerico, String _valorPalo)
	{
		valorNumerico = _valorNumerico;
		valorPalo = _valorPalo;
	}

	/**
	 * Metodo que devuelve el valor numerico de la carta
	 * @return numeros como (1,2,3,4,5,6,7,10,11,12)
	 */
	public int getValorNumerico()
	{
		return valorNumerico;
	}

	/**
	 * Metodo que devuelve el valor del palo de la carta
	 * @return palo como (Oros, copas, espadas, bastos)
	 */
	public String getValorPalo()
	{
		return valorPalo;
	}
}