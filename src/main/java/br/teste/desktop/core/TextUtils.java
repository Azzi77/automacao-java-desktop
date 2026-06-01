package br.teste.desktop.core;

import java.text.Normalizer;

public class TextUtils {

    public static String limpar(String texto) {

        return Normalizer
                .normalize(texto, Normalizer.Form.NFD)
                .replaceAll("[^\\p{ASCII}]", "")
                .replaceAll("[^a-zA-Z0-9@._ -]", "");
    }
}