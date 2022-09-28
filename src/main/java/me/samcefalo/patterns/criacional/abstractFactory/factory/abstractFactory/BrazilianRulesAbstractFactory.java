package me.samcefalo.patterns.criacional.abstractFactory.factory.abstractFactory;

import me.samcefalo.patterns.criacional.abstractFactory.models.certificate.BrazilianCertificate;
import me.samcefalo.patterns.criacional.abstractFactory.models.certificate.Certificate;
import me.samcefalo.patterns.criacional.abstractFactory.models.packing.BrazilianPacking;
import me.samcefalo.patterns.criacional.abstractFactory.models.packing.Packing;

public class BrazilianRulesAbstractFactory implements CountryRulesAbstractFactory {

	public Certificate getCertificates() {
		return new BrazilianCertificate();
	}

	public Packing getPacking() {
		return new BrazilianPacking();
	}

}
