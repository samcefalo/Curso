package me.samcefalo.patterns.criacional.factory.apple.after.simple.factory;

import me.samcefalo.patterns.criacional.factory.apple.models.*;

public enum IPhoneFactory {

    IPHONE_X {
        @Override
        public IPhone createIPhone() {
            return new IPhoneX();
        }
    },
    IPHONE_XSMAX {
        @Override
        public IPhone createIPhone() {
            return new IPhoneXSMax();
        }
    },
    IPHONE_11 {
        @Override
        public IPhone createIPhone() {
            return new IPhone11();
        }
    },
    IPHONE_11PRO {
        @Override
        public IPhone createIPhone() {
            return new IPhone11Pro();
        }
    };

    public IPhone orderIPhone() {
        IPhone device = this.createIPhone();
        if (device != null) {
            device.getHardware();
            device.assemble();
            device.certificates();
            device.pack();
        }
        return device;
    }

    public abstract IPhone createIPhone();


}
