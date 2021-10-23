package com.promineotech.videogames.entity;

import lombok.Builder;
import lombok.Data; 


@Data 
@Builder
public class games { 
  private long game_id; 
  private String title; 
  private String genre; 
  private char rating;

}
