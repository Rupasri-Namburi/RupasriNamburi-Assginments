import java.util.*;
import java.util.HashMap;
import java.util.Date;

@SuppressWarnings("unused")
public class Pair<key,value> {
	private String key;
	private String value;
	private Date date;
	Pair(){}
	public Pair(String key, String value) {
		super();
		this.setkey(key);
		this.value = value;
	}
	public Pair(String key, Date date) {
		super();
		this.key = key;
		this.date = date;
	}
	public String getkey() {
		return key;
	}
	public void setkey(String key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

}

