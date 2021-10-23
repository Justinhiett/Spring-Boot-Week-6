package com.promineotech.videogames.controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.promineotech.videogames.entity.Account;
import com.promineotech.videogames.service.GamesService;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j 
public class DefaultGameAccountController implements GameAccountController {

  @Autowired 
  private GamesService gamesService;
  
  @Override
  public Account createAccount(@Valid Account account) {
    // TODO Auto-generated method stub
    return gamesService.createAccount(account);
  }

  @Override
  public List<Account> fetchAccounts(Account account_ID) {
    // TODO Auto-generated method stub
    return null;
  }

}
