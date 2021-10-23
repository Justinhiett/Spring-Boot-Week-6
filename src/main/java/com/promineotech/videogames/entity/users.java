package com.promineotech.videogames.entity;

import lombok.Builder;
import lombok.Data;


public class users { 
  private int user_ID; 
  private static int game_fk; 
  private String user_name; 
  
  
  public int getUser_ID() {
    return user_ID;
  }
  public void setUser_ID(int user_ID) {
    this.user_ID = user_ID;
  }
  public static int getGame_fk() {
    return game_fk;
  }
  public void setGame_fk(int game_fk) {
    this.game_fk = game_fk;
  }
  public String getUser_name() {
    return user_name;
  }
  public void setUser_name(String user_name) {
    this.user_name = user_name;
  }

}
