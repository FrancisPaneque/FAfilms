package Utils;

import java.util.List;
import java.util.Scanner;

import models.Usuarios;
import dao.UsuarioDaoImpl;

public class aaaa {

	public static void main(String[] args) {
		GestorUsuarioSQL gestor = new GestorUsuarioSQL();
		Scanner sc = new Scanner(System.in);
		System.out.println("usario: ");
		String usuario = sc.nextLine();
		
		System.out.println("password: ");
		String password = sc.nextLine();
		
		/*Usuarios carmen = new Usuarios(6, "carmen", "1234", "aaaa", "aaaa");
		gestor.insert(carmen);*/
		
		Usuarios user = gestor.searchUsuario(usuario);
		if (usuario.compareTo(user.getUsuario()) == 0) {
			if (password.compareTo(user.getPassword()) == 0) {
				System.out.println("Estrepitoso");
			} else {
				System.out.println("error paswword");
			}
		} else {
			System.out.println("error user");
		}
		
		  /*Usuario userio = new Usuario(2, "alvaro", "aaa", "aaaa", "aaa"); 
		  Usuario carmen = new Usuario(1, "carmen", "aaa", "aaaa", "aaa");
		  gestor.insert(userio); 
		  gestor.insert(carmen);
		  
		  Usuario alvaro = gestor.searchUsuario("alvaro");
		  System.out.println(alvaro.getUsuario());*/
		 
		
		/*
		 * List<Object[]> salida = user.getUsuarioByName("alex123"); for (Object[]
		 * resultado : salida) { for (Object result : resultado)
		 * System.out.println(result); }
		 */
		
		
	}

}
