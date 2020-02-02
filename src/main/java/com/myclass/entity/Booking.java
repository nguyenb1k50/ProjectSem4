package com.myclass.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "bookings")
public class Booking {
@Id
private String id;

@Column (name = "movie_id")
private String movieId;

@OneToOne
@JoinColumn(name = "movie_id", foreignKey = @ForeignKey(name="fk_movie_booking"),
insertable = false, updatable = false)

@JsonIgnore
private Movie movie;

@Column(name = "user_id")
private String userId;

@ManyToOne
@JoinColumn(name = "user_id", foreignKey = @ForeignKey(name="fk_booking_user"),
insertable = false, updatable = false)
@JsonIgnore
private User user;

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getMovieId() {
	return movieId;
}

public void setMovieId(String movieId) {
	this.movieId = movieId;
}

public Movie getMovie() {
	return movie;
}

public void setMovie(Movie movie) {
	this.movie = movie;
}

public String getUserId() {
	return userId;
}

public void setUserId(String userId) {
	this.userId = userId;
}

public User getUser() {
	return user;
}

public void setUser(User user) {
	this.user = user;
}

public Booking() {
	super();
}

public Booking(String id, String movieId, Movie movie, String userId, User user) {
	super();
	this.id = id;
	this.movieId = movieId;
	this.movie = movie;
	this.userId = userId;
	this.user = user;
}


}
