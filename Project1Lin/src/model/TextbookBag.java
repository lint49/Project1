package model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TextbookBag implements Serializable{
	
	private Textbook[] t;
	private int nElems;
	
	public TextbookBag(int maxSize){
		t = new Textbook[maxSize];
		nElems = 0;
		
	}

	public void add(Textbook textbook){
		t[nElems++] = textbook;
	}
	
	public void display() {
		for (int i = 0; i < nElems; i++) {
			System.out.println(t[i]);
		}
		System.out.println();
	}
	
	public int getNElems() {
		return nElems;
	}
	
	public boolean delete(Textbook isbn) {
		int j;
		for (j = 0; j < nElems; j++) {
			if (t[j] == isbn) {
				break;
			}
		}

		if (j == nElems) {
			return false;
		} else {
			for (int k = j; k < nElems - 1; k++) {
				t[k] = t[k + 1];
			}
			nElems--;
			return true;
		}
	}
	
	public Textbook findByIsbn(String isbn) {
		int i = -1;
		for(i = 0; i < nElems; i++) {
			if(t[i].getIsbn().equals(isbn)){
				break;
			}
		}
		if(i == nElems) {
			return null;
		} else {
			return t[i];
		}
	}
	
	public void load() throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("Textbook.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		t = (Textbook[]) ois.readObject();
		ois.close();

	}
	
	public void save() throws IOException {
		FileOutputStream fos = new FileOutputStream("Textbook.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(t);
		oos.close();
	}
	
}
