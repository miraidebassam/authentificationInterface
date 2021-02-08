package connexion.base.donnees.jdbc;

import java.sql.Connection;
import javax.swing.JOptionPane;

public class TestConnexion {

	public static void main(String[] args) {
		try (Connection connexion = DBmanager.getConnexion()) {
			JOptionPane.showMessageDialog(null, "Connexion a la base de donnes OK !");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE );
		}

	}
}
