package macor.algorithm.demo.codedesign.visitor.ultimate;

import java.util.ArrayList;
import java.util.List;

public class CommonOpt {
    public static void opt(){
        Extractor extractor = new Extractor();
        Compressor compressor = new Compressor();
        List<ResourceFile> resource = listAllResourceFiles();
        for (ResourceFile resourceFile : resource){
            resourceFile.accept(extractor);
            resourceFile.accept(compressor);
        }
    }

    private static List listAllResourceFiles(){
        List<ResourceFile> resourceFiles = new ArrayList<>();
        resourceFiles.add(new PdfFile("a.ptf"));
        resourceFiles.add(new PPTFile("b.ppt"));
        resourceFiles.add(new WordFile("c.word"));
        return resourceFiles;
    }
}
