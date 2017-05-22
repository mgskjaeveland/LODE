package it.essepuntato.lode;

import javax.xml.transform.TransformerException;

import org.junit.Test;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyStorageException;

public class OodeTest {
	
	@Test public void testFOAF() throws OWLOntologyCreationException, OWLOntologyStorageException, TransformerException {
		Oode.main("-o http://xmlns.com/foaf/spec/index.rdf".split(" "));
	}

	@Test public void testOWL() throws OWLOntologyCreationException, OWLOntologyStorageException, TransformerException {
		Oode.main("-o http://www.w3.org/2002/07/owl".split(" "));
	}	
}
