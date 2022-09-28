package me.samcefalo.patterns.criacional.factory.apple.after.simple;

import me.samcefalo.patterns.criacional.factory.apple.after.simple.factory.IPhoneFactory;
import me.samcefalo.patterns.criacional.factory.apple.models.IPhone;

public class ClientEnum {

    /*
    Ao invés de utilizar diretamente o operador "new", podemos utilizar algum
    padrão que nos forneça mais flexibilidade no código, encapsulando a construção do objeto em fábricas.

    Factory => criação de fábricas para cada objeto de um conjunto.
    Half Simple => criação de fábricas para cada categoria do objeto (IphoneX e Iphone11).
    Simple => Uma fábrica para um conjunto de objeto.
    */
    public static void main(String[] args) {

        System.out.println("### Ordering an iPhone X");
        IPhone iphone = IPhoneFactory.IPHONE_X.orderIPhone();
        System.out.println(iphone);

        System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
        IPhone iphone2 = IPhoneFactory.IPHONE_11PRO.orderIPhone();
        System.out.println(iphone2);
    }

}
