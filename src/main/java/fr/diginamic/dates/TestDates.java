package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDates {

	public static void main(String[] args) {
		/*
		 * Créez une instance de la classe java.util.Date à la date du jour en utilisant
		 * un de ses constructeurs
		 */
		
		Date date = new Date(120, 02, 12);
		SimpleDateFormat formatage1 = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println(formatage1.format(date));

		/* création d'une date + heure + gestion du format d'affichage + affichage de
		 celle-ci*/
		Date date2 = new Date(120, 02, 12, 23, 30, 59);
		SimpleDateFormat formatage2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(formatage2.format(date2));

		// Affichage de la date système sous formatage2
		Date date3 = new Date();
		System.out.println(formatage2.format(date3.getTime()));

	}

}
