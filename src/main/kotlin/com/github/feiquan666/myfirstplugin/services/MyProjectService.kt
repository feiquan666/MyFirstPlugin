package com.github.feiquan666.myfirstplugin.services

import com.intellij.openapi.project.Project
import com.github.feiquan666.myfirstplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
