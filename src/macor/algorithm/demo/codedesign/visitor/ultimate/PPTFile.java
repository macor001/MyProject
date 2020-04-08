package macor.algorithm.demo.codedesign.visitor.ultimate;

public class PPTFile extends ResourceFile {
    public PPTFile(String filePath) {
        super(filePath);
    }

    @Override
    public void accept(Visitor vistor) {
        vistor.visit(this);
    }
}
