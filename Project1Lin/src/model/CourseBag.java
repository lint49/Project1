package model;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;


public class CourseBag implements Serializable{
	private CourseType[] ct;
	private int nElems;

	public CourseBag(int maxSize) {
		ct = new CourseType[maxSize];
		nElems = 0;
	}

	public void add(String courseName, CourseCategory courseCategory) {
		ct[nElems++] = new CourseType(courseName, courseCategory);
	}

	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.println(ct[i]);
		}
		System.out.println();
	}

	public int getNElems() {
		return nElems;
	}

	public String[] getCoursesTook() {
		ArrayList<String> tempList = new ArrayList<>();
		for (int i = 0; i < nElems; i++) {
			if (ct[i].getCourseCategory() == CourseCategory.TOOK) {
				tempList.add(ct[i].getCourseNumber());
			}
		}
		return (String[]) tempList.toArray();
	}
	
	public String[] getCoursesTaking() {
		ArrayList<String> tempList = new ArrayList<>();
		for (int i = 0; i < nElems; i++) {
			if (ct[i].getCourseCategory() == CourseCategory.TAKING) {
				tempList.add(ct[i].getCourseNumber());
			}
		}
		return (String[]) tempList.toArray();
	}
	
	public String[] getCoursesTO_TAKE() {
		ArrayList<String> tempList = new ArrayList<>();
		for (int i = 0; i < nElems; i++) {
			if (ct[i].getCourseCategory() == CourseCategory.TO_TAKE) {
				tempList.add(ct[i].getCourseNumber());
			}
		}
		return (String[]) tempList.toArray();
	}
	
	
	public void load() throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("Course.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ct = (CourseType[]) ois.readObject();
		ois.close();
	}

}
