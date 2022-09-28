package me.samcefalo.patterns.criacional.abstractFactory.factory;

import me.samcefalo.patterns.criacional.abstractFactory.factory.abstractFactory.CountryRulesAbstractFactory;
import me.samcefalo.patterns.criacional.abstractFactory.models.iphone.IPhone;
import me.samcefalo.patterns.criacional.abstractFactory.models.iphone.IPhoneX;
import me.samcefalo.patterns.criacional.abstractFactory.models.iphone.IPhoneXSMax;

public class IPhoneXFactory extends IPhoneFactory {

    public IPhoneXFactory(CountryRulesAbstractFactory rules) {
        super(rules);
    }

    public IPhone createIPhone(String level) {
        if (level.equals("standard")) {
            return new IPhoneX(rules);
        } else if (level.equals("highEnd")) {
            return new IPhoneXSMax(rules);
        } else return null;
    }

}
