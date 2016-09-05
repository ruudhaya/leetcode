public class IsSubsequence {
	public boolean isSubsequence(String s, String t) {
		int tFromIndex = 0;
		for (char sLetter : s.toCharArray()) {
			int index = t.indexOf(sLetter, tFromIndex);

			if (index < 0) {
				return false;
			}

			tFromIndex = index + 1;
		}
		return true;
	}
}
