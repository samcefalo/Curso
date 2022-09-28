package me.samcefalo.patterns.criacional.factory.apple.after.factory;

import me.samcefalo.patterns.criacional.factory.apple.models.IPhone;
import me.samcefalo.patterns.criacional.factory.apple.models.IPhone11;

public class IPhone11Factory extends IPhoneFactory {

    @Override
    protected IPhone createIPhone() {
        return new IPhone11();
    }

}
