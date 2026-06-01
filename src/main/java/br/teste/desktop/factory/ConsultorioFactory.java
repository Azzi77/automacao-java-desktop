package br.teste.desktop.factory;
import br.teste.desktop.core.TextUtils;
import br.teste.desktop.model.Consultorio;
import com.github.javafaker.Faker;
import java.util.Locale;

public class ConsultorioFactory {

    private static final Faker faker =
            new Faker(new Locale("pt-BR"));

    public static Consultorio criar() {

        return new Consultorio(

                TextUtils.limpar(
                        "CLINICA " + faker.company().name()
                ),

                faker.number().digits(5),

                "119" + faker.number().digits(8),

                "119" + faker.number().digits(8),

                TextUtils.limpar(
                        faker.internet().emailAddress()
                ),

                "17017240",

                TextUtils.limpar(
                        faker.address().streetName()
                                + " "
                                + faker.number().numberBetween(1, 999)
                ),

                "CENTRO",

                "BAURU",

                "SP"
        );
    }
}