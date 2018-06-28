package MODEL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MySQLDAO1 {
    
    private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/sistemadb";
	private static final String USUARIO = "root";
	private static final String SENHA = "123456Abc";
	
	public static Connection criaConexao() throws Exception {
		Class.forName(DRIVER);
		
		Connection conexao = DriverManager.getConnection(URL,USUARIO, SENHA);
		
		return conexao;
	}
	
	public static void main (String args[]) throws Exception {
		
		Connection conn = criaConexao();
		
		if (conn != null){
			System.out.println("Conexão realizada com sucesso" + conn);
			conn.close();
		}
	}
    
}
