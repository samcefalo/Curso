package me.samcefalo.patterns.criacional.factory.apple.after.factory;

import me.samcefalo.patterns.criacional.factory.apple.models.IPhone;
import me.samcefalo.patterns.criacional.factory.apple.models.IPhoneXSMax;

public class IPhoneXSMaxFactory extends IPhoneFactory {

    @Override
    protected IPhone createIPhone() {
        return new IPhoneXSMax();
    }

}
