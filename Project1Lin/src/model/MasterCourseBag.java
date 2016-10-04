package model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class MasterCourseBag implements Serializable {
	private Course[] c;
	private int nElems;

	public MasterCourseBag(int maxSize) {
		c = new Course[maxSize];
		nElems = 0;
	}

	public void add(Course course) {
		c[nElems++] = course;
	}

	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.println(c[i]);
		}
		System.out.println();
	}

	public Course findByCourseNumber(String courseNumber) {
		int i = -1;
		for (i = 0; i < nElems; i++) {
			if (c[i].getCourseNumber().equals(courseNumber)) {
				break;
			}
		}
		if (i == nElems) {
			return null;
		} else {
			return c[i];
		}
	}

	public boolean delete(Course num) {
		int j;
		for (j = 0; j < nElems; j++) {
			if (c[j] == num) {
				break;
			}
		}

		if (j == nElems) {
			return false;
		} else {
			for (int k = j; k < nElems - 1; k++) {
				c[k] = c[k + 1];
			}
			nElems--;
			return true;
		}
	}

	public void load() throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("Course.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		c = (Course[]) ois.readObject();
		ois.close();

	}

	public void save() throws IOException {
		FileOutputStream fos = new FileOutputStream("Course.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(c);
		oos.close();
	}

}
