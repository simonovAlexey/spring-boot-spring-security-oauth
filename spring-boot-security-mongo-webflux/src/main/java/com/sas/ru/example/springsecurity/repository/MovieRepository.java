package com.sas.ru.example.springsecurity.repository;

import com.sas.ru.example.springsecurity.model.Movie;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface MovieRepository {
  public Mono<Movie> getMovieById(Long id);
  public Flux<Movie> listMovies();
  public Mono<Void> saveMovie(Mono<Movie> movie);
  public Mono<Movie> putMovie(Long id, Mono<Movie> movie);
  public Mono<String> deleteMovie(Long id);
}
