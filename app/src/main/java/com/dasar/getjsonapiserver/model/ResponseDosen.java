package com.dasar.getjsonapiserver.model;

import java.util.List;

public class ResponseDosen{
	private List<SemuadosenItem> alldosen;
	private boolean error;
	private String message;

	public void setSemuadosen(List<SemuadosenItem> semuadosen){
		this.alldosen = semuadosen;
	}

	public List<SemuadosenItem> getSemuadosen(){
		return alldosen;
	}

	public void setError(boolean error){
		this.error = error;
	}

	public boolean isError(){
		return error;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	@Override
 	public String toString(){
		return 
			"ResponseDosen{" + 
			"semuadosen = '" + alldosen + '\'' +
			",error = '" + error + '\'' + 
			",message = '" + message + '\'' + 
			"}";
		}
}