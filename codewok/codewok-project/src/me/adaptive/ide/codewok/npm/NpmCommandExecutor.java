/*
 * Copyright 2014-2015. Adaptive.me.
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

package me.adaptive.ide.codewok.npm;

import com.intellij.execution.ui.ConsoleView;
import me.adaptive.ide.codewok.SimpleCommandLineExecutor;
import me.adaptive.ide.common.utils.ExecutableDetectorUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;

/**
 * Created by panthro on 17/04/15.
 */
public class NpmCommandExecutor extends SimpleCommandLineExecutor {

    public static final String NPM_COMMAND = "npm";
    public static final String INSTALL_COMMAND = "install";
    public static final String UPDATE_COMMAND = "update";

    public static final String[] AVAILABLE_COMMANDS = new String[]{INSTALL_COMMAND, UPDATE_COMMAND};


    private String basePath;

    public NpmCommandExecutor(@NotNull String basePath) {
        this.basePath = basePath;
    }

    public String getBasePath() {
        return basePath;
    }

    public void setBasePath(String basePath) {
        this.basePath = basePath;
    }

    public void runInstall(@Nullable ConsoleView consoleView) {
        runCommand(INSTALL_COMMAND, consoleView);
    }

    public void runUpdate(@Nullable ConsoleView consoleView) {
        runCommand(UPDATE_COMMAND, consoleView);
    }

    public void runCommand(String command, @Nullable ConsoleView consoleView) {
        runCommand(new ExecutableDetectorUtil(NPM_COMMAND).detect(), getBasePath(), Arrays.asList(new String[]{command}), consoleView);
    }

}
