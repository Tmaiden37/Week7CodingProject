/**
 * 
 */
package projects;

import java.sql.Connection;

import projects.dao.DbConnection;

/**
 * @author travismaiden
 *
 */
public class ProjectsApp {

	
	public static void main(String[] args) {
	Connection conn = DbConnection.getConnection();
	}

}
