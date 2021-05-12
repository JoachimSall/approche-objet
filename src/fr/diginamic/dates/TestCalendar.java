package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class TestCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		cal.set(2016, 4, 19, 23, 59, 30);
		
		SimpleDateFormat formateur = new SimpleDateFormat("EEEEE dd MMMM yyyy HH:mm:ss");
		System.out.println(formateur.format(cal.getTime()));
		
		formateur = new SimpleDateFormat("EEEEE dd MMMM yyyy HH:mm:ss", new Locale("RU"));
		System.out.println(formateur.format(cal.getTime()));
		
		formateur = new SimpleDateFormat("EEEEE dd MMMM yyyy HH:mm:ss", Locale.CHINA);
		System.out.println(formateur.format(cal.getTime()));
		
		formateur = new SimpleDateFormat("EEEEE dd MMMM yyyy HH:mm:ss", Locale.GERMANY);
		System.out.println(formateur.format(cal.getTime()));
		
	}

}
