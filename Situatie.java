package procesare;

import java.util.ArrayList;
import java.util.List;

public class Situatie {

	private Student student;
	private List<Nota> note;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public List<Nota> getNote() {
		return note;
	}

	public void setNote(List<Nota> note) {
		this.note = note;
	}

	public void addNota(Nota nota) {
		if (note == null) {
			note = new ArrayList<Nota>();
		}
		note.add(nota);
	}

	// public float getMedie() {
	// float s = 0;
	// int n = 0;
	// for (Nota nota : note) {
	// s += nota.getNota();
	// n++;
	// }
	// return n == 0? 0: s/n;
	// }
}
