package model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class PeopleBag implements Serializable {
	
	private Person[] p;
	private int nElems;
	
	public PeopleBag(int maxSize) {
		p = new Person[maxSize];
		nElems = 0;
	}

	public void add(Student student) {
		p[nElems++] = student;
	}
	public void add(Faculty faculty) {
		p[nElems++] = faculty;
	}
	
	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.println(p[i]);
		}
		System.out.println();
	}
	
	public int getNElems() {
		return nElems;
	}
	
	public boolean delete(Person id) {
		int j;
		for (j = 0; j < nElems; j++) {
			if (p[j] == id) {
				break;
			}
		}

		if (j == nElems) {
			return false;
		} else {
			for (int k = j; k < nElems - 1; k++) {
				p[k] = p[k + 1];
			}
			nElems--;
			return true;
		}
	}
	
	public Person findByID(String id) {
		int i = -1;
		for(i = 0; i < nElems; i++) {
			if(p[i].getId().equals(id)){
				break;
			}
		}
		if(i == nElems) {
			return null;
		} else {
			return p[i];
		}
	}
	
	public void load() throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("People.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		p = (Person[]) ois.readObject();
		ois.close();

	}
	public void save() throws IOException {
		FileOutputStream fos = new FileOutputStream("People.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(p);
		oos.close();
	}
	
}
