package me.samcefalo.patterns.criacional.factory.db.after;

import me.samcefalo.patterns.criacional.factory.db.after.factory.OracleDBFactory;
import me.samcefalo.patterns.criacional.factory.db.after.models.DB;

public class Client {

    /*
    Ao invés de utilizar diretamente o operador "new", podemos utilizar algum
    padrão que nos forneça mais flexibilidade no código, encapsulando a construção do objeto em fábricas.

    Factory => criação de fábricas para cada objeto de um conjunto.
    Half Simple => criação de fábricas para cada categoria do objeto (IphoneX e Iphone11).
    Simple => Uma fábrica para um conjunto de objeto.
    */
    public static void main(String[] args) {
        //DB db = new PostgresDBFactory().getDatabase();
        DB db = new OracleDBFactory().getDatabase();

        db.query("SELECT * FROM users");
        db.update("INSERT INTO users VALUES ('User', 25)");
    }
}
