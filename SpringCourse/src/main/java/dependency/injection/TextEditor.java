package dependency.injection;

public class TextEditor {
	private SpellChecker spellChecker;
	private CommentChecker commentChecker;
	private CommentChecker commentCheckerByName;
	private String name;
	
	public TextEditor(SpellChecker spellChecker) {
		System.out.println("Inside TextEditor constructor.");
		this.spellChecker = spellChecker;
	}

	public void spellCheck() {
		spellChecker.checkSpelling();
	}

	// a setter method to inject the dependency.
	public void setCommentChecker(CommentChecker commentChecker) {
		System.out.println("Inside setCommentChecker.");
		this.commentChecker = commentChecker;
	}

	// a getter method to return spellChecker
	public CommentChecker getCommentChecker() {
		return commentChecker;
	}

	public void commentCheck() {
		commentChecker.checkComment();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CommentChecker getCommentCheckerByName() {
		return commentCheckerByName;
	}

	public void setCommentCheckerByName(CommentChecker commentCheckerByName) {
		System.out.println("Inside setCommentCheckerByName.");
		this.commentCheckerByName = commentCheckerByName;
	}
}
