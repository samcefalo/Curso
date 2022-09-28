package me.samcefalo.patterns.criacional.factory.apple.after.factory;

import me.samcefalo.patterns.criacional.factory.apple.models.IPhone;

public abstract class IPhoneFactory {

    public IPhone orderIPhone() {
        IPhone device = createIPhone();

        if (device != null) {
            device.getHardware();
            device.assemble();
            device.certificates();
            device.pack();
        }

        return device;
    }

    protected abstract IPhone createIPhone();
}
