package com.github.ldavidsp.vemtotemplate.services

import com.intellij.openapi.project.Project
import com.github.ldavidsp.vemtotemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
