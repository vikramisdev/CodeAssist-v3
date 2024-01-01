package com.tyron.code.project.impl.model;

import com.tyron.code.info.ClassInfo;
import com.tyron.code.project.model.module.SourceModule;

import java.nio.file.Path;
import java.util.HashSet;
import java.util.Set;

public class SourceModuleImpl<T extends ClassInfo> extends AbstractModule implements SourceModule<T> {
    private final Set<T> classInfos;

    public SourceModuleImpl(Path root) {
        super(root);
        this.classInfos = new HashSet<>();
    }

    public void addClass(T info) {
        classInfos.add(info);
    }

    @Override
    public Set<T> getFiles() {
        return classInfos;
    }
}
