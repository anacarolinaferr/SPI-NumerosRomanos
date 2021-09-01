package com.numerosromanos.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class NumerosRomanos {

    @GetMapping("/converter")
    public String numerosRomanos(@RequestParam Integer numero){
        int[] valorDecimal = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        String[] valorRomano = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        String res = "";
        int i = 0;
        while (numero > 0) {
            if (numero >= valorDecimal[i]) {
                res += valorRomano[i];
                numero -= valorDecimal[i];
            } else {
                i++;
            }
        }
        return res;
    }
}
