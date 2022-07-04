package xyz.feneco.species;

import xyz.feneco.jtrees.JTrees;
import java.io.File;

public interface LoaderInterface {
    public JTrees<String> loadFile(File f);
}
