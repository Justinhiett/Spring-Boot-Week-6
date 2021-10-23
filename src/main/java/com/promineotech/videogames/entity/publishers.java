package com.promineotech.videogames.entity;

import lombok.Builder;
import lombok.Data;

@Data 
@Builder
public class publishers { 
  private long publisher_id; 
  private long game_fk; 
  private String publisher_name;

}
