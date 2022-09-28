package me.samcefalo.patterns.criacional.factory.apple.after.halfSimple.factory;

import me.samcefalo.patterns.criacional.factory.apple.models.IPhone;
import me.samcefalo.patterns.criacional.factory.apple.models.IPhoneX;
import me.samcefalo.patterns.criacional.factory.apple.models.IPhoneXSMax;

public class IPhoneXFactory extends IPhoneFactory {

    @Override
    protected IPhone createIPhone(String level) {
        if (level.equals("standard")) {
            return new IPhoneX();
        } else if (level.equals("highEnd")) {
            return new IPhoneXSMax();
        } else return null;
    }
}
