/*
 * SonarQube
 * Copyright (C) 2009-2017 SonarSource SA
 * mailto:info AT sonarsource DOT com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package org.sonarqube.ws.client.projectbranches;

import java.util.List;
import javax.annotation.Generated;

/**
 * Rename the main branch of a project.<br/>Requires 'Administer' permission on the specified project.
 *
 * This is part of the internal API.
 * This is a POST request.
 * @see <a href="https://next.sonarqube.com/sonarqube/web_api/api/project_branches/rename">Further information about this action online (including a response example)</a>
 * @since 6.6
 */
@Generated("https://github.com/SonarSource/sonar-ws-generator")
public class RenameRequest {

  private String name;
  private String project;

  /**
   * New name of the main branch
   *
   * This is a mandatory parameter.
   * Example value: "branch1"
   */
  public RenameRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  /**
   * Project key
   *
   * This is a mandatory parameter.
   * Example value: "my_project"
   */
  public RenameRequest setProject(String project) {
    this.project = project;
    return this;
  }

  public String getProject() {
    return project;
  }
}