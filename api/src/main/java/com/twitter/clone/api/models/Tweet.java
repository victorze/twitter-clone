package com.twitter.clone.api.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "tweets")
public class Tweet {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTweets;
	private String text;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone="America/Lima" )
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at")
	private Date createdAt;

    /* Relación, pero no sé con que se relaciona */
    /* @ManyToOne
	@JoinColumn(name = "idUsers")
	private Tweet tweet; */

    public int getIdTweets() {
        return idTweets;
    }

    public void setIdTweets(int idTweets) {
        this.idTweets = idTweets;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
