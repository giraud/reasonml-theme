package com.github.giraud.reasonmltheme.services

import com.intellij.openapi.project.Project
import com.github.giraud.reasonmltheme.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
