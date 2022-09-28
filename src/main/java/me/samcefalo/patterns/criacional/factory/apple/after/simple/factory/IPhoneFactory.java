package me.samcefalo.patterns.criacional.factory.apple.after.simple.factory;

import me.samcefalo.patterns.criacional.factory.apple.models.*;

public enum IPhoneFactory {

    IPHONE_X {
        @Override
        public IPhone orderIPhone() {
            return new IPhoneX();
        }
    },
    IPHONE_XSMAX {
        @Override
        public IPhone orderIPhone() {
            return new IPhoneXSMax();
        }
    },
    IPHONE_11 {
        @Override
        public IPhone orderIPhone() {
            return new IPhone11();
        }
    },
    IPHONE_11PRO {
        @Override
        public IPhone orderIPhone() {
            return new IPhone11Pro();
        }
    };

    public abstract IPhone orderIPhone();

}
