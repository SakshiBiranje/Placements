public class Main2 {
    public static void main(String[] args) {
        String input = "a1b2c3"; 
        String result = modifyString(input); 
        System.out.println(result);
    }

    public static String modifyString(String str) {
        StringBuilder modifiedString = new StringBuilder();

        
        for (int i = 0; i < str.length(); i++) {
            
            if ((i + 1) % 3 == 0) {
                char prevChar = str.charAt(i - 1);
                modifiedString.append(String.valueOf(prevChar).repeat(i)); 
            } else {
                modifiedString.append(str.charAt(i)); 
            }
        }

        return modifiedString.toString();
    }
}
