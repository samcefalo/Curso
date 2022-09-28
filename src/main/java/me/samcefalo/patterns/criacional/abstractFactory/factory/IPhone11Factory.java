package me.samcefalo.patterns.criacional.abstractFactory.factory;

import me.samcefalo.patterns.criacional.abstractFactory.factory.abstractFactory.CountryRulesAbstractFactory;
import me.samcefalo.patterns.criacional.abstractFactory.models.iphone.IPhone;
import me.samcefalo.patterns.criacional.abstractFactory.models.iphone.IPhone11;
import me.samcefalo.patterns.criacional.abstractFactory.models.iphone.IPhone11Pro;

public class IPhone11Factory extends IPhoneFactory {

	public IPhone11Factory(CountryRulesAbstractFactory rules) {
		super(rules);
	}

	public IPhone createIPhone(String level) {
		if (level.equals("standard")) {
			return new IPhone11(rules);
		} else if (level.equals("highEnd")) {
			return new IPhone11Pro(rules);
		} else return null;
	}

}
