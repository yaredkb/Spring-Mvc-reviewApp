package Review;

public class Review {
 public long id;
 public String title;
 public String imageUrl;
 public String reviewCatagory;
 public String content;
 
public long getId() {
	return id;
}

public String getTitle() {
	return title;
}

public String getImageUrl() {
	return imageUrl;
}

public String getReviewCatagory() {
	return reviewCatagory;

}

public String getContent() {
	return content;
}


public Review (long id, String title, String imageUrl,String reviewVategory, String content) {
	super();
	this.id=id;
	this.title =title;
	this.imageUrl=imageUrl;
	this.reviewCatagory = reviewVategory;
	this.content=content;
	
}

}

 
 
	

