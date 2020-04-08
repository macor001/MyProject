package macor.algorithm.demo.codedesign.visitor.ultimate;

public interface Visitor {
    void visit(PdfFile pdfFile);
    void visit(PPTFile pdfFile);
    void visit(WordFile pdfFile);
}
