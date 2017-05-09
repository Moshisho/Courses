package io.moshisho.plugins;

/*
 * Copyright 2001-2005 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import org.apache.maven.model.Dependency;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.project.MavenProject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Goal which touches a timestamp file.
 *
 * @goal warn
 * 
 * @phase process-sources
 */
public class MyMojo
    extends AbstractMojo
{
    /**
     * Location of the file.
     * @parameter property="project.build.directory"
     * @required
     */
    private File outputDirectory;

    /**
     * @parameter property="project"
     * @required
     */
    private MavenProject mavenProject;

    public void execute()
        throws MojoExecutionException
    {
        Map<String, String> gaVersion = new HashMap<String, String>();

        for (MavenProject mp : mavenProject.getCollectedProjects()){
            for (Dependency dependency : mp.getDependencies()){
                String key = dependency.getGroupId() + ":" + dependency.getArtifactId();
                if (gaVersion.containsKey(key)) {
                    if (!gaVersion.get(key).equals(dependency.getVersion())) {
                        getLog().warn("[WARNING] !!! duplicate version! for " + key);
                        getLog().warn("[WARNING] !!! duplicate version! already have: " + gaVersion.get(key) + " new: " + dependency.getVersion());
                    }
                }
                else
                    gaVersion.put(key, dependency.getVersion());
            }
        }
    }
}
