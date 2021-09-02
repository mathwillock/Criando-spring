package com.example.demo.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumerosRomanos {


    @GetMapping("/numeroromano/{num}")
    public String numerosRomanos (@PathVariable int num) {

        String [] numberRoman = {
                "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "IXX", "XX"
        };

        int indice = num -1;

        switch (num) {
            case 0:
                return "O número " + num + " não existe no numeral Romano. Por favor, tente outro numero";

            case 40:
                return " " + num + " => XL";

            case 50:
                return num + " => L";

            case 60:
                return num + " => LX";

            case 70:
                return num + " => LXX";

            case 80:
                return num + " => LXXX";

            case 90:
                return num + " => XC";

            case 100:
                return num + " => C";

            default:
                return num + " => " + numberRoman[indice];

        }


    }






}
