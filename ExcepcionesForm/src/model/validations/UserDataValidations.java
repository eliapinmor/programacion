/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.validations;

import java.time.LocalDate;
import model.exceptions.AgeException;
import model.exceptions.IdFormatException;

/**
 *
 * @author eliapinmor
 */
public class UserDataValidations {

    /**
     *
     * @param typeDoc
     * @param id
     * @return id documento a validar;
     * devuelve un boolean
     */
//    public static boolean checkId(int typeDoc, String id) {
//        boolean idOk = false;
//        String letras[] = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
//        if (typeDoc == 1 && id.length() == 9) {
//            String num = id.substring(0, id.length() - 1);
//            int numD = Integer.parseInt(num);
//            boolean numIsNum = isNumeric(num);
//            if (numIsNum) {
//                String letraDni = id.substring(id.length() - 1, id.length());
//                if (letraDni.equals(letras[numD % 23])) {
//                    idOk = true;
//                }
//            }
//        }
//        return idOk;
//    }
    public static void checkId(int typeDoc, String id) throws IdFormatException {
        boolean idOk = false;
        String letras[] = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        if (typeDoc == 1 && id.length() == 9) {
            String num = id.substring(0, id.length() - 1);
            int numD = Integer.parseInt(num);
            boolean numIsNum = isNumeric(num);
            if (numIsNum) {
                String letraDni = id.substring(id.length() - 1, id.length());
                if (letraDni.equals(letras[numD % 23])) {
                    idOk = true;
                }
            }
        }
        if (idOk == false){
            throw new IdFormatException("NIF incorrecto");
        }
    }

    /**
     * 
     * @param date
     * @return formato de fecha dd/mm/yyyy correcto
     */
    
    public static boolean checkFormatDate(String date) {
        Boolean dateOk = false;
        int monthArray[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int dateArrayInt[] = new int[3];
        if (date.length() == 10) {
            String dateArray[] = date.split("/");
            dateOk = true;
            for (int i = 0; i < dateArray.length && dateOk; i++) {
                if (i == 2) {
                    if (dateArray[i].length() != 4) {
                        dateOk = false;
                    }
                } else {
                    if (dateArray[i].length() != 2) {
                        dateOk = false;
                    }
                }
            }
            if (dateOk) {
                for (int i = 0; i < dateArray.length && dateOk; i++) {
                    boolean isNum = isNumeric(dateArray[i]);
                    if (!isNum) {
                        dateOk = false;
                    } else {
                        dateArrayInt[i] = Integer.parseInt(dateArray[i]);
                    }
                }
            }
            if (dateOk) {
                if (dateArrayInt[1] <= 12 && dateArrayInt[1] > 0) {
                    if (dateArrayInt[0] <= monthArray[dateArrayInt[1]] && dateArrayInt[0] > 0) {
                        if (dateArrayInt[2] <= 2100 && dateArrayInt[2] > 1900) {

                        } else {
                            dateOk = false;
                        }
                    } else {
                        dateOk = false;
                    }
                } else {
                    dateOk = false;
                }
            }

        }
        return dateOk;
    }
    
    /**
     * 
     * @param birthDate
     * @return age; if age not correct age = -1; si la fecha de nacimiento es posterior a la fecha actual age = -1
     */

//    public static int calculateAge(String birthDate) {
//        int age = -1;
//        Boolean dateOk = checkFormatDate(birthDate);
//        int dateArrayInt[] = new int[3];
//
//        if (dateOk) {
//            String dateArray[] = birthDate.split("/");
//            for (int i = 0; i < dateArrayInt.length; i++) {
//                dateArrayInt[i] = Integer.parseInt(dateArray[i]);
//
//            }
//
//            if (dateArrayInt[1] > LocalDate.now().getMonthValue() || dateArrayInt[0] > LocalDate.now().getDayOfMonth()) {
//                age = (LocalDate.now().getYear() - dateArrayInt[2]) - 1;
//            } else if (dateArrayInt[1] < LocalDate.now().getMonthValue() || dateArrayInt[0] <= LocalDate.now().getDayOfMonth()) {
//                age = (LocalDate.now().getYear() - dateArrayInt[2]);
//            } else {
//                age = -1;
//            }
//        }
//        return age;
//    }
    public static int calculateAge(String birthDate) throws AgeException {
        int age = -1;
        Boolean dateOk = checkFormatDate(birthDate);
        int dateArrayInt[] = new int[3];

        if (dateOk) {
            String dateArray[] = birthDate.split("/");
            for (int i = 0; i < dateArrayInt.length; i++) {
                dateArrayInt[i] = Integer.parseInt(dateArray[i]);

            }

            if (dateArrayInt[1] > LocalDate.now().getMonthValue() || dateArrayInt[0] > LocalDate.now().getDayOfMonth()) {
                age = (LocalDate.now().getYear() - dateArrayInt[2]) - 1;
            } else if (dateArrayInt[1] < LocalDate.now().getMonthValue() || dateArrayInt[0] <= LocalDate.now().getDayOfMonth()) {
                age = (LocalDate.now().getYear() - dateArrayInt[2]);
            } else {
                throw new AgeException("No se puede calcular la edad");
            }
        }
        return age;
    }

    /**
     * 
     * @param zip
     * @return zip is num and length menor a 5
     */
    
    public static boolean checkPostalCode(String zip) {
        Boolean isNum = isNumeric(zip);
        if (isNum && zip.length() == 5) {
            return true;
        } else {
            return false;
        }

    }
    
    /**
     * 
     * @param numStr
     * @return numStr contiene solo numeros; boolean
     */

    public static boolean isNumeric(String numStr) {
        Boolean isNumOk = true;

        for (int i = 0; i < numStr.length(); i++) {
            if (!Character.isDigit(numStr.charAt(i))) {
                isNumOk = false;
            }
        }
        return isNumOk;
    }
    
    /**
     * 
     * @param str
     * @return str contiene solo letras; boolean
     */

    public static boolean isAlphabetic(String str) {
        System.out.println("");
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isLetter(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /**
     * 
     * @param email
     * @return estructura email correcta: snsnsn@ssss.sss; la primera parte puede contener letras is numeros
     */
    
    public static boolean checkEmail(String email) {
        if (email.contains("@") && email.contains(".")) {
            String emailArrayAt[] = email.split("@");
            if (emailArrayAt.length == 2 && emailArrayAt[0].isEmpty()==false && emailArrayAt[1].isEmpty()==false) {
                if(emailArrayAt[1].contains(".")){
                    String emailArrayDot[] = emailArrayAt[1].split("\\.");// pongo \\ para que me lo tome como valor literal
                    if (emailArrayDot.length == 2) {
                        for (int i = 0; i < emailArrayDot.length; i++) {
                            if(!isAlphabetic(emailArrayDot[i])){
                                return false;
                            }
                        }
                        return true;
                    }
                }
 
            }
        }
        return false;
    }

    /**
     * 
     * @param name
     * @return name contiene letras y la longitud no supera los 41 caracteres
     */
    
    public static boolean checkName(String name) {
        if (isAlphabetic(name) && name.length() <= 41) {
            return true;

        } else {
            return false;

        }
    }

}
