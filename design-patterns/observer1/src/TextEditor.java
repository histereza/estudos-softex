import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class TextEditor extends Editor {
    private String state;
    private File file;
    private int lineNumber;
    private String text;

    public TextEditor(int lineNumber, String text) {
        this.lineNumber = lineNumber;
        this.text = text;
    }


    public int getLineNumber() {
        return lineNumber;
    }

    public String getText() {
        return text;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        notifyObservers();
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<String> getTexts() {
        return texts;
    }

    public void setTexts(List<String> texts) {
        this.texts = texts;
    }

    private List<String> texts = new ArrayList<>();

    public void update() {
        System.out.println("Texto '" + this.getText() + "' adicionado à linha " + this.getLineNumber() + " do arquivo.");
    }

    public void insertLine(int lineNumber, String text) {
        this.lineNumber = lineNumber;
        this.text = text;
        if (!(text == "EOF")) {
            this.texts.add(lineNumber, text);
        }
    }

    public void removeLine(int lineNumber) {
        this.lineNumber = lineNumber;
        this.texts.remove(lineNumber);
    }

    public void notifyObservers() {
        for (String text : texts) {
            update();
        }
    }

    @Override
    public void openFile(String filePath) {
        this.file = new File(filePath);
        System.out.println("Você abriu o arquivo " + this.file.getName());;
    }

    @Override
    public void saveFile() {
        System.out.println("Todas as alterações foram salvas: ");
        System.out.println(this.texts);

        try {
            PrintWriter out = new PrintWriter(file);
            out.append(text);

            out.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}