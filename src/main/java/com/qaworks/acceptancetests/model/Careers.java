package com.qaworks.acceptancetests.model;

public class Careers {

	private String jobs;
	private String backToWebsite;
	private String register;
	private String login;

	public Careers(String jobs, String backToWebsite, String register, String login) {
		this.jobs = jobs;
		this.backToWebsite = backToWebsite;
		this.register = register;
		this.login = login;
	}

	public String getJobs() {
		return jobs;
	}

	public void setJobs(String jobs) {
		this.jobs = jobs;
	}

	public String getBackToWebsite() {
		return backToWebsite;
	}

	public void setBackToWebsite(String backToWebsite) {
		this.backToWebsite = backToWebsite;
	}

	public String getRegister() {
		return register;
	}

	public void setRegister(String register) {
		this.register = register;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	@Override
	public String toString() {
		return "Careers [jobs=" + jobs + ", backToWebsite=" + backToWebsite + ", register=" + register + ", login="
				+ login + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((backToWebsite == null) ? 0 : backToWebsite.hashCode());
		result = prime * result + ((jobs == null) ? 0 : jobs.hashCode());
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime * result + ((register == null) ? 0 : register.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Careers other = (Careers) obj;
		if (backToWebsite == null) {
			if (other.backToWebsite != null)
				return false;
		} else if (!backToWebsite.equals(other.backToWebsite))
			return false;
		if (jobs == null) {
			if (other.jobs != null)
				return false;
		} else if (!jobs.equals(other.jobs))
			return false;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		if (register == null) {
			if (other.register != null)
				return false;
		} else if (!register.equals(other.register))
			return false;
		return true;
	}

}
