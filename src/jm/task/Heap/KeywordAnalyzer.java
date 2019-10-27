package jm.task.Heap;

abstract class KeywordAnalyzer {
    String[] getKeywords() {
        return null;
    }

    Label getLabel(String text) {
        for (String s : getKeywords()) {
            if (text.contains(s)) return Label.NEGATIVE_TEXT;
        }
        return Label.OK;
    }
}
