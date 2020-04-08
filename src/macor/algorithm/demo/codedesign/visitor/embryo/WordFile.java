package macor.algorithm.demo.codedesign.visitor.embryo;

public class WordFile extends ResourceFile {
    public WordFile(String filePath) {
        super(filePath);
    }

    @Override
    public void extract2txt() {
        System.out.println("Extract Word.");
    }
}
