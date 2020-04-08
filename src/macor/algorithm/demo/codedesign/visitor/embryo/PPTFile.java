package macor.algorithm.demo.codedesign.visitor.embryo;

public class PPTFile extends ResourceFile {

    public PPTFile(String filePath){
        super(filePath);
    }

    @Override
    public void extract2txt() {
        System.out.println("Extract PPT.");
    }
}
