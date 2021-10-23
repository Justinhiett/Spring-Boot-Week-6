package com.promineotech.videogames.dao;

import java.util.List;
import java.util.Optional;
import com.promineotech.videogames.entity.Account;
import com.promineotech.videogames.entity.games;
import com.promineotech.videogames.entity.users;

public interface GameAccountDao { 
  Account createAccount(long account_ID, long user_fk, long game_fk, String zip_code, String city, String state); 
  
  
  
  
  //List<Account> fetchAccounts(List<String> account_ID);
  Optional<games> fetchgames(long game_id);
  Optional<users> fetchusers(String user_id);  
  Optional<Account> fetchAccounts(String account_ID);




  /**
   * 
   * @param option
   * @param orderPK
   * @return
   */
  Account saveAccount(Account account_ID, games game_fk, users user_fk);
  
  
  Account deleteAccount(Account account_ID, games game_fk, users user_fk); 
  
  

}
