package repository;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {
    public void add(){
        System.out.println("a new product was added");
    }
}
