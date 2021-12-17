package com.api.demo.demo.database;
import com.api.demo.demo.models.Product;
import com.api.demo.demo.repositories.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Database {
    private static final Logger logger = LoggerFactory.getLogger(Database.class);
    @Bean
    CommandLineRunner initDatabase(ProductRepository productRepository){

        return new CommandLineRunner(){
            @Override
            public void run(String... args) throws Exception{
                Product productA = new Product("macbook15",2020,24002.0,"");
                Product productB = new Product("macbook",2020,24040.0,"");
                logger.info("insert data:"+productRepository.save(productA));
                logger.info("insert data:"+productRepository.save(productB));

            }
        };
    }
}
