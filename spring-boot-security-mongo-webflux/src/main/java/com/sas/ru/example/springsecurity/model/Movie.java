package com.sas.ru.example.springsecurity.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "movies")
public class Movie {

  private Long id;
  private String title;
  private String genre;

}
