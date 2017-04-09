# JDBConnector
Connect to any JDBC database without fuss.

In order to have a database connection in Java, you need to know the class method which includes drivers and connection string.
This becomes cumbersome if your application needs to connect multiple databases.

JDBConnector has predifined driver classes and database URLs, so you only need to provide 
  * database type (DBType enum)
  * server
  * database name
  * username
  * and password  
  
You can also use it for custom databases if you know driver class and database url. 
After creating the JDBConnect instance, you just need to call getConnection which returns java.sql.Connection.
 
# Requirements
You have to have relevant database JDBC drivers in your classpath. For example, if you have DB2 drivers in your classpath, you can connect to any DB2 database with:

    JDBConnector dbcon = new JDBConnector(DBType.DB2, "db2server", "50000", "mydatabase", "username", "password");
    
Same goes for other databases:

    JDBConnector dbcon = new JDBConnector(DBType.Sybase, "aseserver", "50000", "mydatabase", "username", "password");
