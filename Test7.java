//print all special words in a string e.g. Anna,BoB

package StringPract;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "MOM AND DAD";
		String w = "";
		s += " ";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (c != ' ') {
				w += c;
			} else {
				char f = w.charAt(0);
				char l = w.charAt(w.length()-1);
				if(Character.toUpperCase(f)==Character.toUpperCase(l))
					System.out.println(w);
				w = "";
			}
		}

	}

}
//result 

// MOM
//DAD
