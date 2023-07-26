//print word start with any particular letter

package StringPract;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "A RED SEED";
		String w = "";
		s += " ";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (c != ' ') {
				w += c;
			} else {
				if(w.startsWith("R"))
					System.out.println(w);
				w = "";
			}
		}
	}
}
//result

//RED

