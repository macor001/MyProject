package macor.algorithm.demo.codedesign.visitor.embryo;

public abstract class ResourceFile {
    protected String filePath;

    public ResourceFile(String filePath){
        this.filePath = filePath;
    }

    public abstract void extract2txt();
}
