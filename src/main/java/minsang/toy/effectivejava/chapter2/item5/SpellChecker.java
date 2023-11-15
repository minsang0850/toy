package minsang.toy.effectivejava.chapter2.item5;

public class SpellChecker {
    private Dictionary dictionary;

    public SpellChecker(DictionaryFactory dictionaryFactory) {
        this.dictionary = dictionaryFactory.getDictionary();
    }
}
