package com.promineotech.videogames.dao;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;
import com.promineotech.videogames.entity.Account;
import com.promineotech.videogames.entity.games;
import com.promineotech.videogames.entity.users;
import lombok.extern.slf4j.Slf4j;

@Component
public class DefaultVideogameDao implements GameAccountDao { 
  
  @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    /**
     * 
     * @param option
     * @param orderPK
     * @return
     */  
  
  @Override
  public Account saveAccount(Account account_ID, games game_fk, users user_fk) {
    
    SqlParams params = generateInsertSql(account_ID, game_fk, user_fk);
    
    KeyHolder keyHolder = new GeneratedKeyHolder();
    
    jdbcTemplate.update(params.sql, params.source, keyHolder);
     
    long account_PK = keyHolder.getKey().longValue();
   // saveUsers(account_PK, game_fk);
    return account_ID;
    
    // @formatter:off
   
    // @formatter:on
  } 
  
  public Optional <Account> deleteAccount(Optional account_ID, games game_fk, users user_fk) {
    String sql = "" 
      + "DELETE * " 
      + "FROM Account " 
      + "WHERE account_ID = account_ID";  
    
    Map<String, Object> params = new HashMap<>();
    params.put("account_id", account_ID);
    
    return Optional.ofNullable(jdbcTemplate.query(sql, params, new AccountResultSetExtractor()));
  }



  private SqlParams generateInsertSql(Account account_ID, games game_fk, users user_fk) {
    // @formatter:off
    String sql = ""
        + "INSERT INTO Account ("
        + "account_ID, game_fk, user_fk "
        + ") VALUES ("
        + ":account_ID, :game_fk, :user_fk"
        + ")";
    // @formatter:on
    
    SqlParams params = new SqlParams();
    
    params.sql = sql;
    
    
    return params;
  }

    class SqlParams {
      String sql;
      MapSqlParameterSource source = new MapSqlParameterSource(); 
      
      
    }
    
    
    public Account createAccount(long account_ID, long user_fk, long game_fk, String zip_code,
        String city, String state) {
        
      return null; 
    }
    
    
  
    @Override
    public Optional<games> fetchgames(long game_id) {
      // TODO Auto-generated method stub
      return null;
    }
    @Override
    public Optional<users> fetchusers(String user_id) {
      // TODO Auto-generated method stub
      return null;
    }  
    
    class AccountResultSetExtractor implements ResultSetExtractor<Account> {
      @Override
      public Account extractData(ResultSet rs) throws SQLException {
        rs.next();

        // @formatter:off
        return Account.builder()
            .account_ID(rs.getString("account_ID"))
            .build();
        // @formatter:on 
        
       
              
        }
      }
    


    
    @Override
    public Optional<Account> fetchAccounts(String account_ID) {
      
      return null;
    }

    @Override
    public Account deleteAccount(Account account_ID, games game_fk, users user_fk) {
      
      return null;
    }
    
  }
  


