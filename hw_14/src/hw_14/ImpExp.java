package hw_14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public interface ImpExp {
	public String getTip();
	ArrayList<Person>impPersons(File file) throws FileNotFoundException ;
	Person getPerson(String s);
	void expPersons(ArrayList<Person> pp2, File expFile);

}
