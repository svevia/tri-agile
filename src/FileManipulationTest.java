import java.io.File;
import java.io.IOException;

import junit.framework.Assert;

import org.junit.Test;


public class FileManipulationTest {
	@Test
	public void getExtension_should_return_empty_when_directory () {
		//Given
		File file =   new File(System.getProperty("java.io.tmpdir")+ "/foo");
		file.mkdir();
		//When
		String actual = FileManipulation.getExtension(file);
		//Then
		file.delete();
		Assert.assertEquals("", actual);

	}

	@Test
	public void getType_should_return_empty_when_directory () {
		//Given
		File file =   new File(System.getProperty("java.io.tmpdir")+ "/foo");
		file.mkdir();
		//When
		String actual = FileManipulation.getType(file);
		//Then
		file.delete();
		Assert.assertEquals(null, actual);

	}
	
	@Test
	public void getName_test () {
		//Given
		File file =   new File(System.getProperty("java.io.tmpdir")+ "/foo.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//When
		String actual = FileManipulation.getNom(file);
		//Then
		file.delete();
		Assert.assertEquals("foo", actual);

	}

}
