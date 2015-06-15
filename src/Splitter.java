public class Splitter {
    public String[] splitLineIntoWords() {
        View view = new View();
        String line = view.getInput();
        String words[] = line.split(" ");
        return words;
    }
}
