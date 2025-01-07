import java.util.HashMap;

public class CharacterFrequency {
    public static void main(String[] args) {
        String input = "hello world";
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        for (char ch : input.toCharArray()) {

            if (frequencyMap.containsKey(ch)) {
                frequencyMap.put(ch, frequencyMap.get(ch) + 1);
            } else {

                frequencyMap.put(ch, 1);
            }
        }


        for (char ch : frequencyMap.keySet()) {
            System.out.println(ch + ": " + frequencyMap.get(ch));
        }
    }
}
