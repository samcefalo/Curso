package me.samcefalo.patterns.criacional.abstractFactory;

import me.samcefalo.patterns.criacional.abstractFactory.factory.IPhone11Factory;
import me.samcefalo.patterns.criacional.abstractFactory.factory.IPhoneFactory;
import me.samcefalo.patterns.criacional.abstractFactory.factory.IPhoneXFactory;
import me.samcefalo.patterns.criacional.abstractFactory.factory.abstractFactory.BrazilianRulesAbstractFactory;
import me.samcefalo.patterns.criacional.abstractFactory.factory.abstractFactory.CountryRulesAbstractFactory;
import me.samcefalo.patterns.criacional.abstractFactory.models.iphone.IPhone;

public class Client {

	public static void main(String[] args) {
		CountryRulesAbstractFactory rules = new BrazilianRulesAbstractFactory();
		//CountryRulesAbstractFactory rules = new USRulesAbstractFactory();
		IPhoneFactory genXFactory = new IPhoneXFactory(rules);
		IPhoneFactory gen11Factory = new IPhone11Factory(rules);

		System.out.println("### Ordering an iPhone X");
		IPhone iphone = genXFactory.orderIPhone("standard");
		System.out.println(iphone);

		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone2 = gen11Factory.orderIPhone("highEnd");
		System.out.println(iphone2);
	}
}
