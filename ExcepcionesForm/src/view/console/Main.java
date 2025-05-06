/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.console;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.exceptions.AgeException;
import model.validations.UserDataValidations;

/**
 *
 * @author eliapinmor
 */
public class Main {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String option = "";
        do {
            System.out.println("Tester funciones UserDataValidations");
            System.out.println("1 - testCheckId");
            System.out.println("2 - testCheckFormatDate");
            System.out.println("3 - testCalculateAge");
            System.out.println("4 - testCheckPostalCode");
            System.out.println("5 - testIsNumeric");
            System.out.println("6 - testIsAlphabetic");
            System.out.println("7 - testCheckEmail");
            System.out.println("8 - testCheckName");
            System.out.println("Z - SALIR");

            System.out.print("Option: ");
            option = scan.next();

            switch (option) {
                case "1":
                    testCheckId();
                    break;
                case "2":
                    testCheckFormatDate();
                    break;
                case "3":
                    testCalculateAge();
                    break;
                case "4":
                    testCheckPostalCode();
                    break;
                case "5":
                    testCheckNumeric();
                    break;
                case "6":
                    testCheckAlphabetic();
                    break;
                case "7":
                    testCheckEmail();
                    break;
                case "8":
                    testCheckName();
                    break;
                case "Z":
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Option no valid");
            }

        } while (!option.equals("Z"));
    }

    static void testCheckId() {
        System.out.println("Enter you id number: ");
        String nif = scan.next();
//        boolean nifOk = UserDataValidations.checkId(1, nif);
//        if (nifOk) {
//            System.out.println("El documento es correcto");
//        } else {
//            System.out.println("El documento es incorrecto");
//        }
    }

    static void testCheckFormatDate() {
        System.out.println("Enter a date: ");
        String date = scan.next();
        boolean dateTestOk = UserDataValidations.checkFormatDate(date);
        if (dateTestOk) {
            System.out.println("Format date correct");
        } else {
            System.out.println("Format date not correct");
        }
    }

    static void testCalculateAge() {
        System.out.println("Introduce tu fecha de nacimiento:");
        String birthDate = scan.next();
        int age;
        try {
            age = UserDataValidations.calculateAge(birthDate);
            System.out.println("Tu edad es: " + age);
        } catch (AgeException ex) {
            System.out.println(ex.getMessage());
        }
    }
//
//    static void testCalculateAge() {
//        System.out.println("Introduce tu fecha de nacimiento:");
//        String birthDate = scan.next();
//        int age = UserDataValidations.calculateAge(birthDate);
//        System.out.println(age);
//        if (age != -1) {
//            System.out.println("Tu edad es: "+age);
//        }
//        else    {
//            System.out.println("Tu fecha de nacimiento no es correcta");
//        }
//    }

    static void testCheckPostalCode() {
        System.out.println("Introduce tu codigo postal");
        String zip = scan.next();
        Boolean postalOk = UserDataValidations.checkPostalCode(zip);
        System.out.println(postalOk);
    }

    static void testCheckNumeric() {
        System.out.println("Enter a number: ");
        String num = scan.next();
        boolean numTestOk = UserDataValidations.isNumeric(num);
        System.out.println(numTestOk);
    }

    static void testCheckAlphabetic() {
        System.out.println("Introduce texto");
        String str = scan.next();
        boolean strOk = UserDataValidations.isAlphabetic(str);
        System.out.println(strOk);
    }

    static void testCheckEmail() {
        System.out.println("Introduce un correo electronico: ");
        String email = scan.next();
        boolean emailOk = UserDataValidations.checkEmail(email);
        System.out.println(emailOk);
    }

    static void testCheckName() {
        System.out.println("Introduce el nombre: ");
        String name = scan.next();
        boolean nameOk = UserDataValidations.checkName(name);
        if (nameOk) {
            System.out.println("El nombre es correcto");
        } else {
            System.out.println("No es correctos");
        }
    }
}
