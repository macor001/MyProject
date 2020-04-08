package macor.algorithm.demo.codedesign.visitor.embryo;

public class PTFFile extends ResourceFile {
    public PTFFile(String filePath) {
        super(filePath);
    }

    @Override
    public void extract2txt() {
        System.out.println("Extract PTF.");
    }
}
