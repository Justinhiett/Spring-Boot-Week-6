package com.promineotech.videogames.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.promineotech.videogames.entity.Account; 

@Service

public class DefaultGamesService implements GamesService {

  @Override
  public Account createAccount(Account account) { 
    Account acc= createAccount(account); 
    
    
    return acc; 
  }
   
  public List<Account> fetchAccount(Account account_ID) { 
    
    return null;
    
  }

  
  }


