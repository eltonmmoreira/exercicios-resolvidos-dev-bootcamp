package com.devBootCamp;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Util {
    public static void print(Object value) {
        System.out.println(value.toString());
    }

    public static String formatarValor(Double valor) {
        if (valor == null) {
            return null;
        }
        var formatter = new DecimalFormat("#,##0.00");
        return formatter.format(valor);
    }

    public static String formatarData(LocalDate localDate) {
        if (localDate == null) {
            return null;
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return formatter.format(localDate);
    }

    public static String formatarData(LocalDateTime localDateTime) {
        if (localDateTime == null) {
            return null;
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return formatter.format(localDateTime);
    }
}
