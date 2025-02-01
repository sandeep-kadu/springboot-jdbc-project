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
        //comment added for learn 2 on 25 jan 2025 this is old comment
    	//ok ok
    	//changes on 1-2-2025 version 2

    	//changes on 1-2-2025
        //this line added on github editor on 1 feb 2025
        //line new

    	jdbc.execute("INSERT INTO user (name, email) VALUES ('sk', 'sbk1.kadu@yopmail.com')");
        return "data inserted Successfully";  
    }  
}  
