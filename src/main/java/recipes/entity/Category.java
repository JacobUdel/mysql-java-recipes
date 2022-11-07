package recipes.entity;

public class Category {
	private Integer CategoryId;
	private String categoryName;
	public Integer getCategoryId() {
		return CategoryId;
	}
	public void setCategoryId(Integer categoryId) {
		CategoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	@Override
	public String toString() {
		return "ID=" + CategoryId + ", categoryName=" + categoryName;
	}
}
