package com.mazurak.pojo;

import java.time.LocalDateTime;
import java.util.List;

public class Session {

	private List<LocalDateTime> sessions;

	public Session(List<LocalDateTime> sessions) {
		this.sessions = sessions;
	}

	public List<LocalDateTime> getSessions() {
		return sessions;
	}

	public void setSessions(List<LocalDateTime> sessions) {
		this.sessions = sessions;
	}

	@Override
	public String toString() {
		return "Session [sessions=" + sessions ;
	}

}
