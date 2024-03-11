package HW8;

import java.util.Objects;

public class Train implements Comparable<Train>{
	//請設計一個Train類別,並包含以下屬性:
	private int number;
	private String type;
	private String start;
	//覆寫compareTo，為了讓treeset可以去重然後順便分辨班號從大到小
	public int compareTo(Train train) {
	if(this.number<train.number) {
		return 1;
	}else if(this.number==train.number) {
		return 0;
	}else {
		return -1;
	}
	}
	//覆寫hashcode跟equals為了可以讓hashset去重
	@Override
	public int hashCode() {
		return Objects.hash(dest, number, price, start, type);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return Objects.equals(dest, other.dest) && number == other.number && Objects.equals(price, other.price)
				&& Objects.equals(start, other.start) && Objects.equals(type, other.type);
	}
	private String dest;
	private Double price;
	public Train(int number, String type, String start, String dest, Double price) {
		super();
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getDest() {
		return dest;
	}
	public void setDest(String dest) {
		this.dest = dest;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	
}
