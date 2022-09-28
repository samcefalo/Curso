package me.samcefalo.patterns.criacional.factory.apple.after.halfSimple;

import me.samcefalo.patterns.criacional.factory.apple.after.halfSimple.factory.IPhone11Factory;
import me.samcefalo.patterns.criacional.factory.apple.after.halfSimple.factory.IPhoneFactory;
import me.samcefalo.patterns.criacional.factory.apple.after.halfSimple.factory.IPhoneXFactory;
import me.samcefalo.patterns.criacional.factory.apple.models.IPhone;

public class Client {

    /*
    Ao invés de utilizar diretamente o operador "new", podemos utilizar algum
    padrão que nos forneça mais flexibilidade no código, encapsulando a construção do objeto em fábricas.

    Factory => criação de fábricas para cada objeto de um conjunto.
    Half Simple => criação de fábricas para cada categoria do objeto (IphoneX e Iphone11).
    Simple => Uma fábrica para um conjunto de objeto.
    */
    public static void main(String[] args) {
        IPhoneFactory iPhoneXFactory = new IPhoneXFactory();
        IPhoneFactory iPhone11ProFactory = new IPhone11Factory();

        System.out.println("### Ordering an iPhone X");
        IPhone iphone = iPhoneXFactory.orderIPhone("standard");
        System.out.println(iphone);

        System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
        IPhone iphone2 = iPhone11ProFactory.orderIPhone("highEnd");
        System.out.println(iphone2);
    }

}
