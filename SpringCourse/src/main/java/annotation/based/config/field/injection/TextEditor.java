package annotation.based.config.field.injection;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Setter injection XML configuration file'daki <property> eklesine gerek olmamaktadir
 * @Autowired eklenmez ise null pointer hatasi alinmaktadir.
 *
 */
public class TextEditor {
	
	@Autowired
	private SpellChecker spellChecker;

	public void spellCheck() {
		getSpellChecker().checkSpelling();
	}

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}
}
