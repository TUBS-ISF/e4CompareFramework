package de.tu_bs.cs.isf.e4cf.core.test;

import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import de.tu_bs.cs.isf.e4cf.core.file_structure.components.Directory;
import de.tu_bs.cs.isf.e4cf.core.file_structure.components.operations.CreateFile;

class CreateFileTest {

	@Mock
	public CreateFile createOp;

	 
	@BeforeEach
	public void setUp() {
	       MockitoAnnotations.initMocks(this);
	}
	
	@Test
	void testCreateFile() {		
		Directory d = new Directory("");
		createOp.execute(d);
		
		verify(createOp).execute(d);
	}

}
