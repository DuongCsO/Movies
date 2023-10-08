package dev.duongcso.movies;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "movies")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
	@Id
	private ObjectId id;
	private String imdbId;
	private String title;
	private String releaseDate;
	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public String getImdbId() {
		return imdbId;
	}
	public void setImdbId(String imdbId) {
		this.imdbId = imdbId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getTrailerLink() {
		return trailerLink;
	}
	public void setTrailerLink(String trailerLink) {
		this.trailerLink = trailerLink;
	}
	public List<String> getGenres() {
		return genres;
	}
	public void setGenres(List<String> genres) {
		this.genres = genres;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public List<String> getBackdrops() {
		return backdrops;
	}
	public void setBackdrops(List<String> backdrops) {
		this.backdrops = backdrops;
	}
	public List<Review> getReviewIds() {
		return reviewIds;
	}
	public void setReviewIds(List<Review> reviewIds) {
		this.reviewIds = reviewIds;
	}
	private String trailerLink;
	private List<String> genres;
	private String poster;
	private List<String> backdrops;
	@DocumentReference // Khiến CSDL chỉ lưu trữ ID của list đối tượng-> Mối quan hệ tham chiếu thủ công
	private List<Review> reviewIds;
}
