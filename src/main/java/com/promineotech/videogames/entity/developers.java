package com.promineotech.videogames.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class developers { 
  private long developer_id; 
  private long publisher_fk; 
  private String developer_name;

}
