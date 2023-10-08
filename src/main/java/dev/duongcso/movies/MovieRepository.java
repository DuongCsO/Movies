package dev.duongcso.movies;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository // Đây là một kho lưu trữ
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
	Optional<Movie> findMovieByImdbId(String ImbdId);
}