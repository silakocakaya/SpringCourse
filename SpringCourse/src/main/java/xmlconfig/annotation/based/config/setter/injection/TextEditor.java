package xmlconfig.annotation.based.config.setter.injection;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Setter injection XML configuration file'daki <property> eklesine gerek olmamaktadir
 * @Autowired eklenmez ise null pointer hatasi alinmaktadir.
 * 
 * 	@Autowired
 *	public void setTextName(String textName) icin bean tanimi yapilmasi gerekmektedir.
 *
 */
public class TextEditor {
	private SpellChecker spellChecker;
	private String textName;
	private Integer number;

	public void spellCheck() {
		getSpellChecker().checkSpelling();
	}

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	@Autowired
	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}

	public String getTextName() {
		return textName;
	}

	@Autowired
	public void setTextName(String textName) {
		this.textName = textName;
	}

	public Integer getNumber() {
		return number;
	}

	@Autowired(required = false)
	public void setNumber(Integer number) {
		this.number = number;
	}
}
