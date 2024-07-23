import java.util.*;

public class Main {

    public static void main(String[] args) {
        String[] words = new String[20];
        fillArray(words);
        printArray(words);
        Set<String> uniqueWords = new HashSet<>();
        fillSetWithArray(uniqueWords, words);
        printSet(uniqueWords);
        HashMap<String, Integer> wordsCount = new HashMap<String, Integer>();
        fillWordsCount(wordsCount, uniqueWords, words);
        printWordsCount(wordsCount);

        Phonebook phonebook = new Phonebook();
        phonebook.add("Цыбуков", "+375297777777");
        phonebook.add("Иванова", "+375297628913");
        phonebook.add("Петрова", "+375441913233");
        phonebook.add("Остапенко", "+375299817657");
        phonebook.add("Игнатьев", "+375447618990");
        phonebook.add("Иванова", "+375296467721");
        phonebook.add("Остапенко", "+375445012395");
        phonebook.add("Остапенко", "+375291114499");
        phonebook.printAll();
    }

    public static void fillArray(String[] array) {
        array[0] = "Сок";
        array[1] = "Владислав";
        array[2] = "Георгий";
        array[3] = "Осень";
        array[4] = "Весна";
        array[5] = "Лето";
        array[6] = "Зима";
        array[7] = "День";
        array[8] = "Год";
        array[9] = "День";
        array[10] = "Месяц";
        array[11] = "Осень";
        array[12] = "Осень";
        array[13] = "Купон";
        array[14] = "Оправа";
        array[15] = "Мышь";
        array[16] = "Попкорн";
        array[17] = "Купон";
        array[18] = "Георгий";
        array[19] = "Коса";
    }

    public static void printArray(String[] words) {
        System.out.println("Первоначальный массив слов:\n");
        for (String word : words) {
            System.out.println(word);
        }
    }

    public static void fillSetWithArray(Set<String> uniqueWords, String[] words) {
        uniqueWords.addAll(Arrays.asList(words).subList(0, 20));
    }

    public static void printSet(Set<String> uniqueWords) {
        System.out.println("\nСписок уникальных слов:\n");
        for (String setWord : uniqueWords) {
            System.out.println(setWord);
        }
    }

    public static void fillWordsCount(HashMap<String, Integer> wordsCount, Set<String> uniqueWords, String[] words) {
        int wordCounter = 0;
        for (String uniqueWord : uniqueWords) {
            for (int i = 0; i < 20; i++) {
                if (Objects.equals(words[i], uniqueWord)) {
                    wordCounter++;
                }
            }
            wordsCount.put(uniqueWord, wordCounter);
            wordCounter = 0;
        }
    }

    public static void printWordsCount(HashMap<String, Integer> wordsCount) {
        for (HashMap.Entry<String, Integer> item : wordsCount.entrySet()) {
            System.out.printf("\nСлово: %s, Количество повторений: %s", item.getKey(), item.getValue());
        }
        System.out.println();
    }
}
