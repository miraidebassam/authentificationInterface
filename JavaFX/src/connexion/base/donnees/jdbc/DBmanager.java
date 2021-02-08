package connexion.base.donnees.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 

public class DBmanager {
	private static Connection connexion = null ;
	
	public static Connection getConnexion () throws Exception {
		try {
			// Chargement du driver jdbc mysql
			
			Class.forName ("com.mysql.cj.jdbc.Driver");
			
			//ouverture de la connexion
			
			connexion = DriverManager.getConnection ("jdbc:mysql://3.86.51.186/dbsysget?serverTimezone=UTC", "usersysget", "myUserSysget@2021");
			
			return connexion ;
			
		} catch (ClassNotFoundException e) {
			throw new Exception("Driver class not found:"+ e.getMessage() + "'") ;
		}catch (SQLException e) {
			throw new Exception("Erreur: Unable to open connection !"+ e.getMessage() + "'") ;
		}
	}
}
