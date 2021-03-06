package character;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Data;

@Data
public class Origin {
	
	@SerializedName("name")
	@Expose
	private String name;
	
	@SerializedName("url")
	@Expose
	private String url;
}
