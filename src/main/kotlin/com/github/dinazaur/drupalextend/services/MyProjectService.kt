package com.github.dinazaur.drupalextend.services

import com.intellij.openapi.project.Project
import com.github.dinazaur.drupalextend.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
