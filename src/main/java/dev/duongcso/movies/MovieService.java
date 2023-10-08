package dev.duongcso.movies;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // Đây là một dịch vụ
public class MovieService {
	@Autowired // Cho biết chúng ra muốn khởi tạo lớp này ở đây -> tiêm nhiễm
	private MovieRepository movieRepository;
	public List<Movie> allMovies(){
		System.out.print(movieRepository.findAll().toString());
		return movieRepository.findAll();
	}
	public Optional<Movie> singleMovie(ObjectId id) {
		return movieRepository.findById(id);
	}
	public Optional<Movie> singleMovie(String imbdId){
		return movieRepository.findMovieByImdbId(imbdId);
	}
}
