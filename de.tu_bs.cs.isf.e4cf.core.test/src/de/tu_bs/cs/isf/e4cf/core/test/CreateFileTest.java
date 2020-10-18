package de.tu_bs.cs.isf.e4cf.core.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import de.tu_bs.cs.isf.e4cf.core.file_structure.FileTreeElement;
import de.tu_bs.cs.isf.e4cf.core.file_structure.components.Directory;
import de.tu_bs.cs.isf.e4cf.core.file_structure.components.operations.CreateFile;

class CreateFileTest {

	private CreateFile createOp;
	private Directory parentDir;
	
	@BeforeEach
	public void setUp() {		
		parentDir = new Directory("dir");
		String filename = "createdFile";
		createOp = new CreateFile(filename);
	}
	
	@Test
	void testCreateFile() {
		FileTreeElement createdFile = createOp.execute(parentDir);
		
		assertTrue(createdFile.exists(), "Created file is supposed to be created.");
	}

}
