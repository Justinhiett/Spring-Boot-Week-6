package com.promineotech.videogames.service;

import java.util.ArrayList; 
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.promineotech.repository.AccountRepository;
import com.promineotech.videogames.entity.Account;

@Service  
public interface GamesService  {  
  
  Account createAccount(Account account);

  List<Account> fetchAccount(Account account_ID);
  
//  @Autowired
//  public AccountRepository accountRepository;
 
  
//  public Account retrieveAccountsById(int account_id) {
//    return null; //accountRepository.findById(account_id).get();
//    
//  } 
//  
//  public void update(Account account) {
//  //  accountRepository.save(account);
//  }
//
//  public List<Account> getAccounts() {
//    List<Account> account = new ArrayList<Account>(); 
//    return null;
//  }
//  
//  
//  public void delete(int account_id) {
//   // accountRepository.deleteById(account_id); 
//  }
//  
  

}
