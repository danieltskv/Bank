import java.sql.SQLException;
import java.util.List;

public interface BankDALInterface {
	
    /**
     * Write an object to the database.
     * Note that the object must be of a supported class type (example: Account, Transaction, etc).
     *
     * @param object the object to be written
     * @return the database object row id
     * @throws NullPointerException if the specified object is null
     * @throws UnsupportedClassException if the specified object is of an unsupported class type
     * @throws SQLException if an SQL exception occurred
     */
	public int create(Object object) throws Exception;
	
    /**
     * Read an object from a database table.
     * Note that the class must be of a supported type (example: Account, Transaction, etc).
     *
     * @param c the class type for the database table (example: Account.class).
     * @param id the database table row id
     * @return the fetched database object
     * @throws NullPointerException if the specified parameters are null
     * @throws UnsupportedClassException if the specified class is of an unsupported type
     * @throws SQLException if an SQL exception occurred
     */
	public Object read(Class<?> c, int id) throws Exception;

    /**
     * Read all objects from a database table.
     * Note that the class must be of a supported type (example: Account, Transaction, etc).
     *
     * @param c the class type for the database table (example: Account.class).
     * @return the fetched database objects
     * @throws NullPointerException if the specified class is null
     * @throws UnsupportedClassException if the specified class is of an unsupported type
     * @throws SQLException if an SQL exception occurred
     */
	public List<Object> readAll(Class<?> c) throws Exception;

    /**
     * Update an object to the database.
     * Note that the object must be of a supported class type (example: Account, Transaction, etc).
     *
     * @param object the object to be updated
     * @return the database object row id
     * @throws NullPointerException if the specified object, or it's ID is null
     * @throws UnsupportedClassException if the specified object is of an unsupported class type
     * @throws SQLException if an SQL exception occurred
     */
	public int update(Object object) throws Exception;
	
    /**
     * Delete an object from the database.
     * Note that the object must be of a supported class type (example: Account, Transaction, etc).
     *
     * @param object the object to be deleted
     * @throws NullPointerException if the specified object is null
     * @throws UnsupportedClassException if the specified object is of an unsupported class type
     * @throws SQLException if an SQL exception occurred
     */
	public void delete(Object object) throws Exception;
}
