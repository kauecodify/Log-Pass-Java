package com.example.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {

private static final Map<String, String> credentials = new HashMap<>();

public static void main (String[] args) {
    
    credentials.put("kaue", "pass1");

    Scanner scanner = new Scanner(System.in);

    System.out.println("Bem-vindo ao sistema de login!");

    
    while (true) {
        System.out.print("Usuário: ");
        String username = scanner.nextLine().toLowerCase(); 

       
        if (credentials.containsKey(username)) {
            System.out.print("Senha: ");
            String password = scanner.nextLine();

           
            if (password.equals(credentials.get(username))) {
                System.out.println("Login bem-sucedido! Bem-vindo, " + username + "!");
                break; 
            } else {
                System.out.println("Senha incorreta. Tente novamente.");
            }
        } else {
            System.out.println("Usuário não encontrado. Tente novamente ou digite 'sair' para sair.");
        }
    }

    scanner.close();
}

}