package me.samcefalo.patterns.criacional.abstractFactory.factory;

import me.samcefalo.patterns.criacional.abstractFactory.factory.abstractFactory.CountryRulesAbstractFactory;
import me.samcefalo.patterns.criacional.abstractFactory.models.iphone.IPhone;

public abstract class IPhoneFactory {
    CountryRulesAbstractFactory rules;

    public IPhoneFactory(CountryRulesAbstractFactory rules) {
        this.rules = rules;
    }

    public IPhone orderIPhone(String level) {
        IPhone device = null;

        device = createIPhone(level);

        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();

        return device;
    }

    protected abstract IPhone createIPhone(String level);
}
