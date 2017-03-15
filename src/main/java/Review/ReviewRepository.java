package Review;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Component;
import java.util.Collection;

@Component
public class ReviewRepository {
	private Map<Long, Review> reviews = new HashMap<Long, Review>();

	
	public ReviewRepository(){
		
		long id = 0l;
		
	Review review = new Review(1,"one", "/images/one.jpg", "I phone", "Electronics");
	reviews.put(id, review);
		
	reviews.put(2l, new Review(2,"Two", "/images/Two.jpg", "Tv", "Electronics"));
    reviews.put(3l, new Review(3,"three", "/images/three.jpg", "i pad", "Electronics"));
    reviews.put(4l, new Review(4,"four", "/images/four.jpg", "Game", "Parts"));
    reviews.put(5l, new Review(5,"five", "/images/five.jpg", "Game", "Parts"));
    reviews.put(6l, new Review(6,"six", "/images/six.jpg", "Game", "Parts"));
	}
	
	public Collection<Review> findAll(){
		return reviews.values();
	}
	public Review findOne(Long id){
		return reviews.get(id);
	}
	  }



