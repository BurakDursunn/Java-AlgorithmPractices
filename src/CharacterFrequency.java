import java.util.HashMap;

public class CharacterFrequency {
    public static void countCharacterFrequency(String str) {
        HashMap<Character, Integer> freqMap = new HashMap<>();
        for (char ch : str.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }
        for (char ch : freqMap.keySet()) {
            System.out.println("Character: " + ch + ", Frequency: " + freqMap.get(ch));
        }
    }

    public static void main(String[] args) {
        String str = "burakdursun";
        countCharacterFrequency(str);
    }
}

