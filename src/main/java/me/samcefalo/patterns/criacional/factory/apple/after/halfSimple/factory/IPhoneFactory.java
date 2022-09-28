package me.samcefalo.patterns.criacional.factory.apple.after.halfSimple.factory;

import me.samcefalo.patterns.criacional.factory.apple.models.IPhone;

public abstract class IPhoneFactory {

    public IPhone orderIPhone(String level) {
        IPhone device = createIPhone(level);

        if (device != null) {
            device.getHardware();
            device.assemble();
            device.certificates();
            device.pack();
        }

        return device;
    }

    protected abstract IPhone createIPhone(String level);
}
