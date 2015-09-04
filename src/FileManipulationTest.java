import java.io.File;

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

}
