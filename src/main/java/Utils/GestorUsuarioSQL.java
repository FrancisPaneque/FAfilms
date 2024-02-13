package Utils;

import java.util.List;

import org.hibernate.Session;

import models.Usuarios;
import dao.UsuarioDaoImpl;

public class GestorUsuarioSQL {
	
	private static boolean iniciado = false;
	private static Session session;
	private static UsuarioDaoImpl usuario;
	
	
	public GestorUsuarioSQL() {
		iniciar();
	}
	
	
	
	/**
	 * @return the session
	 */
	public static Session getSession() {
		return session;
	}


	public static void insert(Usuarios user) {
		if (iniciado == false) {
			iniciar();
		}
		usuario.insert(user);
	}
	public static Usuarios searchUsuario(String name) {
		if (iniciado == false) {
			iniciar();
		}
		
		Usuarios user = usuario.getUsuarioByName(name);
		closeall();
		return user;
		
	}
	
	private static void iniciar() {
		HibernateUtils.buildSessionFactory();
		session = HibernateUtils.openSesion();
		usuario = new UsuarioDaoImpl(session);
	}
	
	public static void closeall() {
		HibernateUtils.closeAll(session);
	}

}
