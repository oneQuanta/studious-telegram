package com.github.onequanta.studioustelegram.services

import com.github.onequanta.studioustelegram.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
