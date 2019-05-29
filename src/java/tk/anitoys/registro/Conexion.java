
package tk.anitoys.registro;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Conexion {
   
   public DriverManagerDataSource conectar(){
       DriverManagerDataSource dataSource = new DriverManagerDataSource ();
       dataSource.setDriverClassName ("com.mysql.jdbc.Driver");
       dataSource.setUrl ("jdbc:mysql://localhost:8889/anitoys");
       dataSource.setUsername("Fabiola");
       dataSource.setPassword("fabiola");
       return dataSource;
    
   }  
}
