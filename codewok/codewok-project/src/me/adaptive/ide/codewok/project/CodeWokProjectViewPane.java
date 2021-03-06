/*
 * Copyright 2000-2015 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package me.adaptive.ide.codewok.project;

import com.intellij.ide.projectView.impl.ProjectViewPane;
import com.intellij.ide.util.treeView.AbstractTreeBuilder;
import com.intellij.openapi.project.Project;
import me.adaptive.ide.icons.AdaptiveIcons;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

/**
 * Created by panthro on 30/04/15.
 */
public class CodeWokProjectViewPane extends ProjectViewPane {

    @NonNls
    public static final String ID = "CodeWokProjectPane";

    public CodeWokProjectViewPane(Project project) {
        super(project);
    }


    @Override
    public String getTitle() {
        return "Adaptive Project";
    }

    @Override
    public Icon getIcon() {
        return AdaptiveIcons.Adaptive;
    }

    @NotNull
    @Override
    public String getComponentName() {
        return getTitle();
    }

    @Override
    public AbstractTreeBuilder getTreeBuilder() {
        return super.getTreeBuilder();
    }
}
