package jm.task.Heap;

public class NegativeTextAnalyzer extends KeywordAnalyzer implements TextAnalyzer {
    String[] keywords = new String[]{":(", " =(", ":|"};

    @Override
    public Label processText(String text) {
        return getLabel(text);
    }
}
