package login1;

import java.util.ArrayList;


public class storage {
	
	private ArrayList<String> words = new ArrayList<String>(); 
	private String lastWord = "";
	private String currentWord = "";
	
	private boolean check = false;
	 
    public String getWords() {
        return this.words.toString();
    }
 
    public void setWords(String words) {
        this.words.add(words);
    }

	public String getCurrentWord() {
		return currentWord;
	}

	public void setCurrentWord(String currentWord) {
		this.currentWord = currentWord;
	}

	public String getLastWord() {
		return lastWord;
	}

	public void setLastWord(String lastWord) {
		this.lastWord = lastWord;
	}

	public void clear() {
		this.words.clear();
	}
	
	public boolean check() {
		if (this.currentWord == this.lastWord){
			return false;
		} else return true;
	}

	public boolean isCheck() {
		return check;
	}

	public void setCheck(boolean check) {
		this.check = check;
	}

	
	
//	save word to display sentences 
	private ArrayList<String> word = new ArrayList<String>(); 
	private String finishword = "";
	private String initialword = "";
	
	private boolean semak = false;
	
	 public String getWord() {
	        return this.word.toString();
	    }
	 
	    public void setWord(String word) {
	        this.word.add(word);
	    }

		public String getInitialWord() {
			return initialword;
		}

		public void setInitialWord(String initialword) {
			this.initialword = initialword;
		}

		public String getFinishWord() {
			return finishword;
		}

		public void setFinishWord(String finishword) {
			this.finishword = finishword;
		}

		public void clear1() {
			this.words.clear();
		}
	
		public boolean check1() {
			if (this.finishword == this.initialword){
				return false;
			} else return true;
		}

		public boolean myCheck() {
			return check;
		}

		public void setCheck1(boolean check) {
			this.check = check;
		}

}
