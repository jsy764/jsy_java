package libray;

import java.util.ArrayList;

public class MainMt {

	public static void main(String[] args) {
		ArrayList<String> book = new ArrayList<>();
		book.add("나의 라임오렌지 나무");
		book.add("피터팬");
		book.add("호밀밭에 파수꾼");
		
		ArrayList<String> author = new ArrayList<>();
		author.add("바스콘셀로스");
		author.add("제임스");
		author.add("샐린저");
		
		ArrayList<Boolean> submit = new ArrayList<>();
		submit.add(true);
		submit.add(false);
		submit.add(false);
		
		BookDAO dao = new BookDAO();
		
		dao.data(book, author, submit);
		
	}

}
