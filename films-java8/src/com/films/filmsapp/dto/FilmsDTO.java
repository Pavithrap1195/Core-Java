package com.films.filmsapp.dto;

public class FilmsDTO implements Comparable<FilmsDTO> {
	
	private int filmId;
	private String name;
	
	public FilmsDTO() {
		// TODO Auto-generated constructor stub
	}

	public FilmsDTO(int filmId, String name) {
		super();
		this.filmId = filmId;
		this.name = name;
	}

	public int getFilmId() {
		return filmId;
	}

	public void setFilmId(int filmId) {
		this.filmId = filmId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "FilmsDTO [filmId=" + filmId + ", name=" + name + "]";
	}
	
	@Override
	public int compareTo(FilmsDTO o) {
		// TODO Auto-generated method stub
		return this.getFilmId()-o.getFilmId();
	}

}
