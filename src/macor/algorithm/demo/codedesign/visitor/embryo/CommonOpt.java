package macor.algorithm.demo.codedesign.visitor.embryo;

import java.util.ArrayList;
import java.util.List;

public class CommonOpt {
    public static void opt(){
        List<ResourceFile> resource = listAllResourceFiles();
        for (ResourceFile resourceFile : resource){
            resourceFile.extract2txt();
        }
    }

    private static List listAllResourceFiles(){
        List<ResourceFile> resourceFiles = new ArrayList<>();
        resourceFiles.add(new PTFFile("a.ptf"));
        resourceFiles.add(new PPTFile("b.ppt"));
        resourceFiles.add(new WordFile("c.word"));
        return resourceFiles;
    }
}
