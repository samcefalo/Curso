package me.samcefalo.patterns.criacional.abstractFactory.factory.abstractFactory;

import me.samcefalo.patterns.criacional.abstractFactory.models.certificate.Certificate;
import me.samcefalo.patterns.criacional.abstractFactory.models.certificate.USCertificate;
import me.samcefalo.patterns.criacional.abstractFactory.models.packing.Packing;
import me.samcefalo.patterns.criacional.abstractFactory.models.packing.USPacking;

public class USRulesAbstractFactory implements CountryRulesAbstractFactory {

    public Certificate getCertificates() {
        return new USCertificate();
    }

    public Packing getPacking() {
        return new USPacking();
    }

}
