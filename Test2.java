//Print first letter from the word and first 2 letters from the word

package StringPract;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "In the box";
		String w = "";
		s += " ";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (c != ' ') {
				w += c;
			} else {
			//	System.out.print(w.charAt(0) + " "); // charAt(0) will only give the first letter bcz indexing starts
				                                     // from zero
				System.out.print(w.substring(0,2)+" ");  // it will give first 2 letter from the word
				w = "";
			}
		}
	}

}

//result for first letter 
//
//I t b

//result for first 2 letter
//
//In th bo 