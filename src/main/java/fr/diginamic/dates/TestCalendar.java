package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestCalendar {

	public static void main(String[] args) {
		// création d'un calendar
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2020);
		cal.set(Calendar.MONTH, 2);
		cal.set(Calendar.DAY_OF_MONTH, 12);
		cal.set(Calendar.HOUR_OF_DAY, 23);
		cal.set(Calendar.MINUTE, 30);
		cal.set(Calendar.SECOND, 59);

		// créer une instance de Date à la date du jour et affichez la au format suivant
		// :
		// jour/mois/année
		Date date1 = cal.getTime();

		SimpleDateFormat formatage1 = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(formatage1.format(date1));

		/*
		 * Utilisez la classe java.util.Calendar pour créer une instance de Date à la
		 * date du jour, et à l’heure suivante : 23h30 et 59 secondes. o Affichez
		 * l’instance ainsi créée au format suivant : année/mois/jour
		 * heure:minute:seconde
		 */
		SimpleDateFormat formatage2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(formatage2.format(date1));

		/*
		 * Utilisez la classe java.util.Calendar pour créer une Date contenant la
		 * date/heure système et affichez la au format suivant : jj-mm-aaaa hh:mm:ss
		 */

		Calendar calMaintenant = Calendar.getInstance();
		SimpleDateFormat formatage3 = new SimpleDateFormat("dd-mm-yyyy hh:mm:ss");
		System.out.println(formatage3.format(calMaintenant.getTime()));

	}

}
