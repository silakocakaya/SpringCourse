package xmlconfig.annotation.based.config.constructor.injection;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Constructoe injection XML configuration file'daki <property> eklesine gerek olmamaktadir
 * @Autowired eklenmez ise null pointer hatasi alinmaktadir.
 *
 */
public class TextEditor {
	
	private SpellChecker spellChecker;
	
	@Autowired
	public TextEditor(SpellChecker spellChecker) {
		super();
		this.spellChecker = spellChecker;
	}

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
