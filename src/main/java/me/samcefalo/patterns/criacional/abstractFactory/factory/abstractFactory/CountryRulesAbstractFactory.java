package me.samcefalo.patterns.criacional.abstractFactory.factory.abstractFactory;

import me.samcefalo.patterns.criacional.abstractFactory.models.certificate.Certificate;
import me.samcefalo.patterns.criacional.abstractFactory.models.packing.Packing;

public interface CountryRulesAbstractFactory {
    Certificate getCertificates();

    Packing getPacking();
}
