package com.uexcel.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.uexcel.model.Phone;

public class PhoneFormatter implements Formatter<Phone> {

	@Override
	public String print(Phone object, Locale locale) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Phone parse(String text, Locale locale) throws ParseException {
		String[] splitedPhone = text.split("-");
		Phone p = new Phone();
		p.setAreacode(splitedPhone[0]);
		p.setPrefix(splitedPhone[1]);
		p.setNumber(splitedPhone[2]);

		return p;
		
	}

}
