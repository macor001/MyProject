package macor.algorithm.demo.codedesign.visitor.ultimate;

public class PdfFile extends ResourceFile{
    public PdfFile(String filePath) {
        super(filePath);
    }

    @Override
    public void accept(Visitor vistor) {
        vistor.visit(this);
    }
}
