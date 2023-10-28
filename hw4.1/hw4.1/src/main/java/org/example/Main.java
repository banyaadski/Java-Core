package org.example;

// 1. Задача: Проверка логина и пароля
//1 - Создать статический метод который принимает на вход три параметра: login, password и confirmPassword.
//2 - Длина login должна быть меньше 20 символов. Если login не соответствует этим требованиям,
//      необходимо выбросить WrongLoginException.
//3 -Длина password должна быть не меньше 20 символов. Также password и confirmPassword должны быть равны.
//      Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.
//4 - WrongPasswordException и WrongLoginException - пользовательские классы исключения с двумя конструкторами –
//      один по умолчанию, второй принимает сообщение исключения и передает его в конструктор класса Exception.
//5 - В основном классе программы необходимо по-разному обработать исключения.
//6 - Метод возвращает true, если значения верны или false в другом случае.
public class Main {
    public static void main(String[] args) {


        String[][] variant = {
                {"Bob", "password", "passwerd"},
                {"John", "password315165168498416", "passwerd6513264513"},
                {"dfghffasfdghjj1234eutfkjgnbcxv", "1452489632596325632", "1452489632596325632"},
                {"Bob", "password", "password"},
        };

        for (int i = 0; i <variant.length; i++) {
            try {
                System.out.println(checkVariants(variant[i][0],variant[i][1],variant[i][2]));
            } catch (WrongLoginException e) {
                System.err.println(e.getMessage());
            } catch (WrongPasswordException e) {
                System.out.println(e.getMessage());;
            };
        }

    }

    public static boolean checkVariants(String login, String password, String confirmPassword) {
        boolean confirm = password.equals(confirmPassword);
        if (login.length() >= 20) {
            throw new WrongLoginException(login.length());
        } else if (password.length() >= 20 || !confirm) {
            throw new WrongPasswordException(password.length(), confirm);
        } else return true;
    }
}