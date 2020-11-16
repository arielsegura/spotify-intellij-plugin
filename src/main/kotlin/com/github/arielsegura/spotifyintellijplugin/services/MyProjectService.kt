package com.github.arielsegura.spotifyintellijplugin.services

import com.intellij.openapi.project.Project
import com.github.arielsegura.spotifyintellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
