package geekbrains.homework.collections.search;

public class MainSearch {

    static String[] text = {"рубиновые", "части", "солнца", "зари",
            "рубят", "злые", "страсти", "сжигают", "внутри",
            "Прыгай", "выше", "неба", "брат", "и", "сестра",
            "Золотые", "искры", "брызги", "костра",
            "Радуйся", "молоту", "в", "крепкой", "руке",
            "Водопад", "молодость", "в", "быстрой", "реке",
            "Бей", "в", "барабан", "бам", "бам",
            "Баррикады", "друзья", "шум", "гам",
            "Воины", "света", "воины", "добра",
            "Охраняют", "лето", "бьются", "до", "утра",
            "Воины", "добра", "воины", "света",
            "Джа", "Растафарай", "бьются", "до", "рассвета"};

    static int count = 0;

    public static void main(String[] args) {
        StringSearcher stringSearcher = new StringSearcher();

        stringSearcher.findListUniWord(text).forEach(s -> System.out.print(s + " "));
        stringSearcher.findDuplicateString(text).forEach((s, integer) -> {
            System.out.println("The word \"" + s + "\" occurs " + integer + " times");
        });
    }
}
