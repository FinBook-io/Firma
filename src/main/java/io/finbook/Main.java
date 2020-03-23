package io.finbook;

import io.finbook.view.implementations.FirmaSwing;
import io.finbook.view.Firma;

public class Main {

    public static void main(String[] args) {

        if(args.length == 0) {
            initFirma(new FirmaSwing("", false, ""));
        } else {
            initFirma(new FirmaSwing(args[0], true, args[1]));
        }
    }

    private static void initFirma(Firma firma) {
        firma.init();
    }
}