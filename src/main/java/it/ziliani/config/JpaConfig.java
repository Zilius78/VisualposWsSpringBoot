package it.ziliani.config;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JpaConfig {
	private String hostName="localhost";
	private String sqlPort ="3306";
    public String getHostName() {
		return hostName;
	}
	public void setHostName(String hostName) {
		this.hostName = hostName;
	}
	public String getSqlPort() {
		return sqlPort;
	}
	public void setSqlPort(String sqlPort) {
		this.sqlPort = sqlPort;
	}
	@Bean(name = "mySqlDataSource")
    DataSource mySqlDataSource()
    {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("com.mysql.jdbc.Driver");
        dataSourceBuilder.url("jdbc:mysql://"+getHostName()+":"+getSqlPort()+"/myristo");
        dataSourceBuilder.username("root");
        dataSourceBuilder.password("block");
        return dataSourceBuilder.build();

    }
	
	

}
