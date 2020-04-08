package macor.algorithm.demo.codedesign.visitor.ultimate;

public class WordFile extends ResourceFile {
    public WordFile(String filePath) {
        super(filePath);
    }

    @Override
    public void accept(Visitor vistor) {
        vistor.visit(this);
    }
}
