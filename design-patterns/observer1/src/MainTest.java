public class MainTest {
    public static void main(String[] args) {
       TextEditor editor = new TextEditor(0, "olá");
        editor.openFile("teste1.TXT");
        editor.insertLine(1, "tudo bem?");
        editor.insertLine(2, "oi");
        editor.removeLine(0);
        editor.update();
        editor.notifyObservers();
        editor.saveFile();
    }
}