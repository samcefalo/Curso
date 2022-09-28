package me.samcefalo.patterns.criacional.abstractFactory.models.certificate;

public class BrazilianCertificate implements Certificate {

	public String applyCertification() {
		return "\t- Calibrating Brasilian rules\n\t- Applying Anatel's Stamp";
	}

}
