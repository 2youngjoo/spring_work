package com.gura.spring.image2.dto;

import org.springframework.web.multipart.MultipartFile;

public class Image2Dto {
	private int num;
	private int price;
	private String writer;
	private String clothesize;
	private String caption;
	private String imagePath;
	private String regdate;	
	private int startRowNum;
	private int endRowNum;
	private int prevNum; // 이전 글의 글 번호
	private int nextNum; // 다음 글의 글 번호
	private MultipartFile image; // 이미지 파일 업로드 처리를 위한 필드
	
	// 생성자
	public Image2Dto() {}

	public Image2Dto(int num, int price, String writer, String clothesize, String caption, String imagePath,
			String regdate, int startRowNum, int endRowNum, int prevNum, int nextNum, MultipartFile image) {
		super();
		this.num = num;
		this.price = price;
		this.writer = writer;
		this.clothesize = clothesize;
		this.caption = caption;
		this.imagePath = imagePath;
		this.regdate = regdate;
		this.startRowNum = startRowNum;
		this.endRowNum = endRowNum;
		this.prevNum = prevNum;
		this.nextNum = nextNum;
		this.image = image;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getClothesize() {
		return clothesize;
	}

	public void setClothesize(String clothesize) {
		this.clothesize = clothesize;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public int getStartRowNum() {
		return startRowNum;
	}

	public void setStartRowNum(int startRowNum) {
		this.startRowNum = startRowNum;
	}

	public int getEndRowNum() {
		return endRowNum;
	}

	public void setEndRowNum(int endRowNum) {
		this.endRowNum = endRowNum;
	}

	public int getPrevNum() {
		return prevNum;
	}

	public void setPrevNum(int prevNum) {
		this.prevNum = prevNum;
	}

	public int getNextNum() {
		return nextNum;
	}

	public void setNextNum(int nextNum) {
		this.nextNum = nextNum;
	}

	public MultipartFile getImage() {
		return image;
	}

	public void setImage(MultipartFile image) {
		this.image = image;
	}
	
}