package com.tyron.code.project.impl.model;

import com.tyron.code.info.JvmClassInfo;
import com.tyron.code.project.model.module.JarModule;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class JarModuleImpl extends SourceModuleImpl<JvmClassInfo> implements JarModule {
    private final Path path;

    public JarModuleImpl(Path path) {
        super(path);
        this.path = path;
    }

    @Override
    public Path getPath() {
        return path;
    }

    @Override
    public Set<JvmClassInfo> getClasses() {
        return getFiles();
    }

}
