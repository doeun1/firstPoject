package com.yedam.collection;

import java.util.*;

public class BoardDao {

	public List<Board> getBoardList() {

		List<Board> list = new ArrayList<Board>();
		list.add(new Board("자바자바", "어렵다"));
		list.add(new Board("김도은", "화이팅"));
		list.add(new Board("김다희", "화이팅!"));

		return list;

	}

}