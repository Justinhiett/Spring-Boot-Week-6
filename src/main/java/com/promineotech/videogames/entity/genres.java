package com.promineotech.videogames.entity;

import lombok.Builder;
import lombok.Data;

@Data 
@Builder 
public class genres { 
  private long genre_id; 
  private long game_fk; 
  private String gen_name; 

}
