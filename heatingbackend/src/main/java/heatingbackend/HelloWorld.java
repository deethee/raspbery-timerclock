
package heatingbackend;

import org.springframework.web.bind.annotation.RequestMapping;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;



@org.springframework.web.bind.annotation.RestController
public class HelloWorld {


	 @RequestMapping("/greet")
	 public String greet() {
                  /*      
                   * 
                   * 
                        
                           SimpleDriverDataSource ds = new SimpleDriverDataSource();
                    ds.setDriver(new org.apache.derby.jdbc.EmbeddedDriver());
                    ds.setUrl("xxx");
                    ds.setUsername("xxx");
                    ds.setPassword("xxx");
                    
                    String sql = "SELECT * FROM public.EQUIPMENTS where id = ?";

                    JdbcTemplate jdbcTemplate = new JdbcTemplate(ds);
                    
                    jdbcTemplate.query(sql, ps -> {
                        ps.setLong(1,  1926);

                    }, rs -> {
                                System.out.println("------------------------------------");
                                System.out.println("------------------------------------");
                                System.out.println("------------------------------------");
                        System.out.println(rs);
                    });
                    
                    System.out.println("------------------------------------");
                    System.out.println("------------------------------------");
                    System.out.println("------------------------------------");
                    System.out.println("------------------------------------");
                    */

		 

               return "successfull";
            }
}

