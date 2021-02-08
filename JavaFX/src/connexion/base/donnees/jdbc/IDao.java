package connexion.base.donnees.jdbc;
import java.util.List;

//import com.ums.entity.User;
import com.ums.exceptions.DAOException;

public interface IDao<T> {

	/**
	 * @param entity
	 * @throws DAOException
	 */
	public void create (T entity) throws DAOException;
	/**
	 * @param id
	 * @return
	 * @throws DAOException
	 */
	public T read (int id) throws DAOException;
	/**
	 * @return
	 * @throws DAOException
	 */
	public List<T> list () throws DAOException;
	/**
	 * @param entity
	 * @throws DAOException
	 */
	public void update (T entity) throws DAOException;
	/**
	 * @param id
	 * @throws DAOException
	 */
	public void delete (int id) throws DAOException;
	//void update(User entity) throws DAOException;

}
