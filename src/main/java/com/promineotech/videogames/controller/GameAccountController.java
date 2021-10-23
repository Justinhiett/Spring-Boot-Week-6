package com.promineotech.videogames.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.promineotech.videogames.entity.Account;
import com.promineotech.videogames.service.GamesService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;  


@Validated 
@RequestMapping
public interface GameAccountController { 
  
  @PostMapping 
  @ResponseStatus(code=HttpStatus.CREATED)
  Account createAccount(@Valid @RequestBody Account account);
  
  
  
  
  // @formatter:off 
  @Operation(
      summary = "Returns a list of Accounts", 
      description = "Returns a list of Accounts given an optional account_ID", 
      responses = {
          @ApiResponse(responseCode = "200", description = "Success"), 
          @ApiResponse(responseCode = "400", description = "bad input"), 
          @ApiResponse(responseCode = "404", description = "not found"), 
          @ApiResponse(responseCode = "500", description = "unplanned error")
      }, 
      parameters = { 
          @Parameter(name = "account_ID", allowEmptyValue = false), 
          @Parameter(name = "game_fk", allowEmptyValue = false)
      
          
      }
      
      
   ) 
   // @formatter:on 
  
  @GetMapping 
  @ResponseStatus(code = HttpStatus.OK)
  List<Account> fetchAccounts(@RequestParam Account account_ID);

}

//  @Autowired 
//  GamesService gameService; 
//  
//  @GetMapping("/Account") 
//  public List<Account> getAccounts() { 
//    return gameService.getAccounts();
//    
//  }   
//  
//  @DeleteMapping("/Account/{account_ID}")
//  public void removeAccount(@PathVariable("account_ID") int account_id) {
//    gameService.delete(account_id);
//  } 
//  
//  
//  @PostMapping("/Account") 
//  public long updateAccount(@RequestBody Account account) {
//    gameService.update(account); 
//    return account.getAccount_ID();
//  }  
//  
 
  
  
  
  
  
 
  
  
  
  

