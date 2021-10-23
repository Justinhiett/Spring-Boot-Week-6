package com.promineotech.videogames.entity;


 
import org.springframework.data.relational.core.mapping.Table;
import com.promineotech.videogames.entity.Account;
import lombok.Builder;
import lombok.Data; 
 
//Many-to-Many Relationship
 
@Data 
@Builder
public class Account { 
  
  private String account_ID; 
  private int user_fk; 
  private int game_fk; 
  private String zip_code; 
  private String city; 
  private String state; 
  
  


//  public void setAccount_ID(String account_ID) {
//    this.account_ID = account_ID;
//  }
//  public int getUser_fk() { 
//    return user_fk;
//  }
//  public void setUser_fk(int user_fk) {
//    this.user_fk = user_fk;
//  }
//  public int getGame_fk() {
//    return game_fk;
//  }
//  public void setGame_fk(int game_fk) {
//    this.game_fk = game_fk;
//  }
//  public String getZip_code() {
//    return zip_code;
//  }
//  public void setZip_code(String zip_code) {
//    this.zip_code = zip_code;
//  }
//  public String getCity() {
//    return city;
//  }
//  public void setCity(String city) {
//    this.city = city;
//  }
//  public String getState() {
//    return state;
//  }
//  public void setState(String state) {
//    this.state = state;
//  }
//  
  
}
