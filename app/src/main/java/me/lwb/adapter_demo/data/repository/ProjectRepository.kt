package me.lwb.adapter_demo.data.repository

import me.lwb.adapter_demo.data.service.Api.projectService

object ProjectRepository {
    suspend fun getProjects(page: Int, id: Int) = projectService.getProjects(page, id)
}
