package com.promineotech.repository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import com.promineotech.videogames.entity.Account;

@Repository
public interface AccountRepository extends CrudRepository<Account, Integer>{ 
  
 public List<Account> account = new ArrayList<Account>();
  

}
