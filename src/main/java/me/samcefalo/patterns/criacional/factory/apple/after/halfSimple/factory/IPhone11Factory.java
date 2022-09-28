package me.samcefalo.patterns.criacional.factory.apple.after.halfSimple.factory;

import me.samcefalo.patterns.criacional.factory.apple.models.IPhone;
import me.samcefalo.patterns.criacional.factory.apple.models.IPhone11;
import me.samcefalo.patterns.criacional.factory.apple.models.IPhone11Pro;

public class IPhone11Factory extends IPhoneFactory {

    @Override
    protected IPhone createIPhone(String level) {
        if (level.equals("standard")) {
            return new IPhone11();
        } else if (level.equals("highEnd")) {
            return new IPhone11Pro();
        } else return null;
    }
}
