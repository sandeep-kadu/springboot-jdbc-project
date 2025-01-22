package com.sandeep;

import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.jdbc.core.JdbcTemplate;  
import org.springframework.web.bind.annotation.RestController;  
@RestController  
public class SpringBootJdbcController {  
    @Autowired  
    JdbcTemplate jdbc;    
    @RequestMapping("/insert")  
    public String index(){  
        //for mysql  //jdbc.execute("insert into user(name,email)values('sandeepKadu','sk@yopmail.com')");  
        //comment added for learn git
    	jdbc.execute("INSERT INTO user (name, email) VALUES ('sk', 'sbk1.kadu@yopmail.com')");
        return "data inserted Successfully";  
    }  
}  